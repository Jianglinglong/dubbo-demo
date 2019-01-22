package jiang.demo.filter;



import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilterFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(FilterFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        //开始时间
        long startTime = System.currentTimeMillis();
        //执行接口调用逻辑
        Result result = invoker.invoke(invocation);
        //调用耗时
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println(String.format("接口:%s中的方法：%s被调用了，用了%sms",invoker.getInterface().getName(),invocation.getMethodName(),elapsed));
        LOGGER.info("接口：{}中的方法：{}被调用，用了：{}ms",invoker.getInterface().getName(),invocation.getMethodName(),elapsed);
        return result;
    }
}
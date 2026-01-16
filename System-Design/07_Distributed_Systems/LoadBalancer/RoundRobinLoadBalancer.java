import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinLoadBalancer {
    private List<String> servers;
    private AtomicInteger index = new AtomicInteger(0);

    public RoundRobinLoadBalancer(List<String> servers) {
        this.servers = servers;
    }

    public String getServer() {
        return servers.get(index.getAndIncrement() % servers.size());
    }
}
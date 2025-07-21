package abstractFactory.cloudFactory.aws;

import abstractFactory.cloudFactory.InstanceService;

public class AwsInstanceService implements InstanceService {
    @Override
    public void launchInstance() {
        System.out.println("Launching AWS instance...");
    }
}

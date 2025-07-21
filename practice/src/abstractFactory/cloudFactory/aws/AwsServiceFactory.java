package abstractFactory.cloudFactory.aws;

import abstractFactory.cloudFactory.CloudServiceFactory;
import abstractFactory.cloudFactory.InstanceService;
import abstractFactory.cloudFactory.StorageService;

public class AwsServiceFactory implements CloudServiceFactory {
    @Override
    public InstanceService createInstanceService() {
        return new AwsInstanceService();
    }

    @Override
    public StorageService createStorageService() {
        return new AwsStorageService();
    }
}

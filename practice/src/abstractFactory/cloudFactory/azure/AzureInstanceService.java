package abstractFactory.cloudFactory.azure;

import abstractFactory.cloudFactory.InstanceService;

public class AzureInstanceService implements InstanceService {
    @Override
    public void launchInstance() {
        System.out.println("Launching Azure instance...");
    }
}

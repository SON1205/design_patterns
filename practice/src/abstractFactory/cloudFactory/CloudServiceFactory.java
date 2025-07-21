package abstractFactory.cloudFactory;

public interface CloudServiceFactory {
    InstanceService createInstanceService();

    StorageService createStorageService();
}

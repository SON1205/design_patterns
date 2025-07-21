package abstractFactory;

import abstractFactory.cloudFactory.CloudServiceFactory;
import abstractFactory.cloudFactory.aws.AwsServiceFactory;

/**
 * 클라이언트(CloudManager)는 구체 클래스(EC2, S3 등)를 몰라도 된다.
 * <p>
 * 각 벤더가 제공하는 서비스 세트를 일관성 있게 구성할 수 있다.
 * <p>
 * 새로운 벤더(GCP 등) 추가 시에도 클라이언트 코드를 수정하지 않아도 된다.
 */
public class AbstractFactoryPrac {
    public static void main(String[] args) {
        CloudServiceFactory factory = new AwsServiceFactory();
//        CloudServiceFactory factory = new AzureServiceFactory();
        CloudManager manager = new CloudManager(factory);
        manager.setup();
    }
}

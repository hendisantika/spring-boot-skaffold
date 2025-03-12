# spring-boot-skaffold

Skaffold is a command-line tool that facilitates continuous development for Kubernetes-native applications. It automates
the build, push, and deploy process, allowing developers to focus on writing code. For this project, Skaffold is
configured to work with a Spring Boot application using Jib for building Docker images.

### Key Components in `skaffold.yaml`:

- **apiVersion**: Specifies the version of the Skaffold configuration.
- **kind**: Defines the type of configuration, which is `Config` in this case.
- **metadata**: Contains metadata about the project, such as the name.
- **build**: Defines how the application should be built. This project uses Jib to build the Docker image.
- **artifacts**: Lists the artifacts to be built. Here, it specifies the image name and the Jib project.
- **manifests**: Lists the Kubernetes manifests to be deployed, including deployment and service YAML files.

### Example `skaffold.yaml`:

```yaml
apiVersion: skaffold/v4beta12
kind: Config
metadata:
  name: spring-boot-skaffold
build:
  artifacts:
    - image: springboot-skaffold
      jib:
        project: id.my.hendisantika:skaffold
manifests:
  rawYaml:
    - k8s/deployment.yml
    - k8s/service.yml
```

### Workflow:

1. **Build**: Skaffold uses Jib to build the Docker image for the Spring Boot application.
2. **Push**: The built image is pushed to a container registry.
3. **Deploy**: The Kubernetes manifests are applied to the cluster, deploying the application.

This setup streamlines the development process, enabling rapid iteration and deployment of changes to the Kubernetes
cluster.

### Steps to Use Skaffold with Your Spring Boot Project

1. **Install Skaffold**:
   - Follow the installation instructions from the [Skaffold documentation](https://skaffold.dev/docs/install/).

2. **Configure `skaffold.yaml`**:
   - Ensure your `skaffold.yaml` file is correctly configured as shown in the provided example.

3. **Build and Deploy**:
   - Open a terminal in the root directory of your project.
   - Run the following command to build and deploy your application using Skaffold:
     ```sh
     skaffold dev
     ```

4. **Access Your Application**:
   - Once deployed, you can access your Spring Boot application using the service URL provided by your Kubernetes
     cluster.
5. **Port Forward our app**
    ```shell
      skaffold dev --port-forward
   ```

6. Or via k8s cmd:
    ```shell
    minikube service list
    ```
   or
    ```shell
    minikube service spring-boot-app
    ```

http://localhost:8080/api/v1/hendi

```json
// 20250312095725
// http://localhost:8080/api/v1/hendi

[
  {
    "userId": 1,
    "lastName": "YUJI",
    "firstName": "ITADORI",
    "position": "father"
  },
  {
    "userId": 2,
    "lastName": "KUGISAKI",
    "firstName": "NAOBARA",
    "position": "mother"
  },
  {
    "userId": 3,
    "lastName": "RYOUMEN",
    "firstName": "SUKUNA",
    "position": "son"
  },
  {
    "userId": 4,
    "lastName": "SUGURU",
    "firstName": "GETO",
    "position": "uncle"
  },
  {
    "userId": 5,
    "lastName": "MEGUMI",
    "firstName": "FUSHIGURO",
    "position": "grandfather"
  }
]
```

These steps will help you set up and use Skaffold for continuous development with your Spring Boot project.

### References :

* https://skaffold.dev/
* https://cloud.google.com/blog/products/application-development/kubernetes-development-simplified-skaffold-is-now-ga
* https://medium.com/swlh/part-ii-spring-boot-app-development-with-skaffold-kustomize-and-jib-aa663e133558

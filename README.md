# Che Plugin Cart

## Build

You can build this plugin using command `mvn clean install`
# Run

Run this sample by mounting assembly to your Che Docker image:

Description of mounted volumes:
- `/var/run/docker.sock` - docker socket, required by Che for launching workspaces
- `/data` - path to Che data files on host system(logs, configuration)
- `/assembly` - path to your Che assembly-main files location (note that it has to point to the unwrapped Che files in `target/<eclipse-che-version>/<eclipse-che-version>` of assembly-main)

Example of running this command
`docker run -it --rm -v /home/user/che-data/:/data -v /home/user/che-cart-plugin/assembly/assembly-main/target/eclipse-che-6.16.0/eclipse-che-6.16.0:/assembly -v /var/run/docker.sock:/var/run/docker.sock eclipse/che:6.16.0 start`

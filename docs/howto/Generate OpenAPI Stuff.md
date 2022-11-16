Install `openapi-generator`

Arch Linux
```console
pacman -S openapi-generator
```

then run this command in the root directory of the project

```console
openapi-generator-cli generate -g java-micronaut-server \
    -i src/main/resources/META-INF/openapi/members.yml -o . \
    -p controllerPackage=space.dezentrale.members.controller \
    -p modelPackage=space.dezentrale.members.model -p build=gradle -p test=junit
```
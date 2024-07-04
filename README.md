## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Mi proyecto
-En este proyecto, se ha desarrollado un sistema de recomendación de amigos utilizando un grafo de usuarios. Cada usuario en el grafo tiene atributos como nombre, edad e intereses. Las conexiones entre usuarios representan relaciones de amistad.El sistema emplea un motor de recomendaciones (RecommendationEngine) que sugiere posibles amigos para un usuario basado en la similitud de intereses. La similitud se calcula mediante la intersección y unión de los intereses de los usuarios. El objetivo es proporcionar recomendaciones de amistad personalizadas para enriquecer la experiencia social de los usuarios.

## v1.0.1
El código implementa un sistema de recomendación de amigos basado en intereses compartidos. Se crea una clase User para representar a los usuarios, que incluye atributos como nombre, edad, intereses y una lista de amigos. La clase Graph gestiona la red de usuarios, permitiendo añadir usuarios y conexiones entre ellos. La clase RecommendationEngine calcula la similitud entre usuarios basada en intereses comunes y recomienda posibles amigos si la similitud es superior al 30%. Finalmente, el método main del programa crea varios usuarios, los añade a la red, establece conexiones entre ellos e imprime la lista de amigos recomendados para un usuario específico.


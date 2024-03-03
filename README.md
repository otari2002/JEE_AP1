# AP N°1 : Inversion de contrôle et Injection des dépendances

Ce projet Java vise à illustrer l'implémentation d'une architecture basique utilisant des interfaces, des implémentations, et l'injection de dépendances. Les principales fonctionnalités du projet comprennent la création d'interfaces `IDao` et `IMetier`, leurs implémentations respectives, et l'injection de dépendances de différentes manières.<br>

1. **Création de l'interface IDao avec une méthode getDate :** <br>
  ![Capture d’écran 2024-02-20 235205](https://github.com/otari2002/JEE_AP1/assets/53525728/1eec4ee9-9637-4a6b-a520-84c2c862825c)<br>

2. **Création d'une implémentation de cette interface :**<br>
  ![Capture d’écran 2024-02-20 235205](https://github.com/otari2002/JEE_AP1/assets/53525728/8439e436-99b9-4c3a-ba0e-685b38afb666)<br>

3. **Création l'interface IMetier avec une méthode calcul :**<br>
![Capture d’écran 2024-02-20 235205](https://github.com/otari2002/JEE_AP1/assets/53525728/4e9ecdad-629c-4789-9674-9c29f8a1bd91)<br>

5. **Création d'une implémentation de cette interface en utilisant le couplage faible :**<br>
![Capture d’écran 2024-02-20 235707](https://github.com/otari2002/JEE_AP1/assets/53525728/b22335d3-2cba-4852-be1d-64ad3a7f3971)<br>

6. **Injection des dépendances :**
   - Par instanciation `statique` :<br>
   ![Capture d’écran 2024-02-20 235747](https://github.com/otari2002/JEE_AP1/assets/53525728/cfc4c205-b238-4f9c-b3df-ad68ed57df22)<br>
   => Exécution : <br>
   ![image](https://github.com/otari2002/JEE_AP1/assets/53525728/f1e659bd-82b6-41d4-b127-f76191646c24)<br>

   - Par instanciation `dynamique` :<br>
   Je vais créer un fichier <strong>config.txt</strong> qui contient le path des classes : <br>
![image](https://github.com/otari2002/JEE_AP1/assets/53525728/353407d8-b3af-45f9-abe9-294b95acb397)<br>
![image](https://github.com/otari2002/JEE_AP1/assets/53525728/c1b47aa8-827c-46e9-96c0-ce689b68c2e8)<br>
   => Exécution : <br>
![image](https://github.com/otari2002/JEE_AP1/assets/53525728/0a1fba68-6480-4b30-855e-d05487631aa2)<br>

  - En utilisant le Framework Spring :<br>
  Je vais ajouter les dependances : spring.core, spring.bean et spring.context dans le fichier pom.xm :<br>
  ![image](https://github.com/otari2002/JEE_AP1/assets/53525728/0e88bb29-be50-4ed2-92e4-e56f147c6a60)<br><br>
   => Version XML : 
  Pour cette version je vais créer un fichier appContext.xml de configuration : <br>
![image](https://github.com/otari2002/JEE_AP1/assets/53525728/dd13cf9a-9262-4cc1-a4a6-1be11c12f789)<br>
Puis une classe de présentation : <br>
![image](https://github.com/otari2002/JEE_AP1/assets/53525728/c4326fc5-8a70-4377-885f-c6886720de0e)<br>
![image](https://github.com/otari2002/JEE_AP1/assets/53525728/c6fb2e9a-bab0-4ed1-b396-e2225f831c11)<br><br>
  => Version Annotation : 
  Pour cette version, il faut ajouter l’annotation `@Component` aux implementations des interfaces <br>
  ![image](https://github.com/otari2002/JEE_AP1/assets/53525728/d3daa3ad-fa1a-41fd-8ebc-4462f8ffe171) <br>
  ![image](https://github.com/otari2002/JEE_AP1/assets/53525728/976489b4-d65e-4acb-a6a2-6ffd07922529)<br>
  Voici la classe de présentation :<br>
  ![image](https://github.com/otari2002/JEE_AP1/assets/53525728/51ed39dc-d2e0-4532-abdc-af6f32bd628d)

  





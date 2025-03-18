# 🏰 Mise en place d’un environnement de développement avec Java 🚀

Ce projet configure un environnement de développement Java structuré et professionnel en utilisant **JavaFX, Maven, JUnit, Checkstyle et Git**. 📦

---

## 🌟 Cahier des charges

### ✅ **Tests unitaires**
- 📌 Utilisation de **JUnit** pour tester le code.
- 📌 Exécution des tests avec `mvn test`.
- 📌 Génération d’un **rapport de couverture des tests**.

### 🔒 **Gestion des fichiers sensibles (.env)**
- 🔹 Un fichier **.env** stocke les informations sensibles.
- 🔹 **Ne doit pas être commit** grâce à `.gitignore`.

### 🎨 **Linter (Checkstyle)**
- ✅ Utilisation du **Google Java Style** pour un code propre.
- ✅ Vérification avec `mvn checkstyle:check`.

### 🏰 **Maven**
- 📦 Gestion des dépendances et des builds.
- 🔍 Configuration pour exécuter les tests et Checkstyle.

### 🎨 **JavaFX**
- 🖥️ Interface graphique avec JavaFX.
- 🎭 Utilisation de fichiers **.fxml** et de contrôleurs.

---

## 🚀 **Installation & Configuration**

1️⃣ **Cloner le projet**
```bash
git clone https://github.com/ton-repo/projet-env-java.git
cd projet-env-java
```

2️⃣ **Configurer l’environnement**  
Assure-toi d’avoir **JDK 17+** et **Maven** installés.

3️⃣ **Exécuter les tests** ✅
```bash
mvn test
```

4️⃣ **Lancer l’application** 🎭
```bash
mvn javafx:run
```

---

## 🔧 **Commandes utiles**

| Commande | Description |
|----------|------------|
| `mvn clean install` | 🔄 Compile et installe les dépendances |
| `mvn test` | ✅ Exécute les tests unitaires |
| `mvn checkstyle:check` | 🎨 Vérifie la qualité du code |
| `mvn javafx:run` | 🖥️ Lance l’application JavaFX |

---

## 📝 **Convention de commits**

Utilisation du format **Conventional Commits** 🕏

🔹 `feat:` ➝ Ajout d’une nouvelle fonctionnalité.  
🔹 `fix:` ➝ Correction d’un bug.  
🔹 `docs:` ➝ Mise à jour de la documentation.  
🔹 `style:` ➝ Correction de l’apparence du code (pas de logique modifiée).

Exemple :
```bash
git commit -m "feat: ajout de l'interface graphique principale"
```

---

## 📝 **Auteurs**
👨‍💻 **Sofiane**  - _Développeur_

---

💡 **Améliorations possibles** : Ajouter des tests plus poussés, optimiser l’interface JavaFX... 🚀  


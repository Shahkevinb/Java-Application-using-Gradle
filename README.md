# Java Application using Gradle

A production-ready Java application demonstrating modern DevOps practices with Gradle build automation, dependency management, and CI/CD pipelines.

## 📋 Overview

This project implements **TASK 3: Java Application using Gradle** and covers:
- ✅ Automate Java project builds using Gradle
- ✅ Manage dependencies efficiently
- ✅ Integrate CI/CD pipelines for continuous delivery
- ✅ Streamline build and deployment processes
- ✅ Core DevOps principles in Java development

## 🏗️ Project Structure

```
java-application-using-gradle/
├── src/
│   ├── main/
│   │   └── java/com/example/app/
│   │       ├── MainApplication.java    # Application entry point
│   │       └── UserService.java        # Business logic service
│   └── test/
│       └── java/com/example/app/
│           └── UserServiceTest.java    # Unit tests
├── gradle/wrapper/                     # Gradle wrapper files
├── .github/workflows/
│   └── ci-cd.yml                       # CI/CD pipeline configuration
├── build.gradle                        # Build configuration & dependencies
├── settings.gradle                     # Project settings
└── README.md                           # This file
```

## 🚀 Quick Start

### Prerequisites
- Java JDK 17 or higher
- Gradle 8.5 (or use the included wrapper)

### Build the Project

```bash
# Using Gradle wrapper (recommended)
./gradlew build

# Or using system Gradle
gradle build
```

### Run Tests

```bash
./gradlew test
```

### Run the Application

```bash
./gradlew run
```

### Build JAR File

```bash
./gradlew jar
```

The JAR file will be generated in `build/libs/`

## 📦 Dependencies

The project uses the following dependencies managed via Gradle:

| Dependency | Version | Purpose |
|------------|---------|---------|
| slf4j-api | 2.0.9 | Logging API |
| logback-classic | 1.4.11 | Logging implementation |
| gson | 2.10.1 | JSON processing |
| junit-jupiter | 5.10.0 | Unit testing |
| mockito-core | 5.7.0 | Mocking for tests |

### Adding New Dependencies

To add a new dependency, edit `build.gradle`:

```groovy
dependencies {
    implementation 'group:artifact:version'  // For runtime dependencies
    testImplementation 'group:artifact:version'  // For test dependencies
}
```

## 🔄 CI/CD Pipeline

This project includes a GitHub Actions workflow for continuous integration and delivery.

### Pipeline Features

- **Automatic Build**: Runs on every push and pull request
- **Test Execution**: Automatically runs unit tests
- **Artifact Generation**: Creates JAR files for deployment
- **Auto-Deployment**: Deploys to GitHub Releases on main branch pushes

### Workflow Triggers

| Event | Action |
|-------|--------|
| Push to main/master | Full build + test + deploy |
| Pull request to main/master | Build + test |
| Manual trigger | Full build + test |

### View Pipeline Status

Check the Actions tab in GitHub to see build status and logs.

## 🛠️ DevOps Principles Implemented

### 1. Build Automation
- Gradle handles compilation, testing, and packaging
- Consistent build process across environments
- Reproducible builds with Gradle wrapper

### 2. Dependency Management
- Centralized dependency management in `build.gradle`
- Version control for all dependencies
- Automatic dependency resolution via Maven Central

### 3. Continuous Integration
- Automated builds on code changes
- Automatic test execution
- Code quality checks

### 4. Continuous Delivery
- Automatic artifact generation
- GitHub Releases integration
- One-click deployment capability

### 5. Infrastructure as Code
- Pipeline configuration in version control
- Reproducible deployment process
- Documentation of build procedures

## 📖 Additional Gradle Commands

```bash
# Clean build directory
./gradlew clean

# Run specific test class
./gradlew test --tests UserServiceTest

# Show dependencies tree
./gradlew dependencies

# Generate IntelliJ project files
./gradlew idea

# Check for dependency updates
./gradlew dependencyUpdates
```

## 📝 License

This project is for educational purposes.

## 👤 Author

Created as part of TASK 3: Java Application using Gradle

---

**Happy Coding! 🎉**
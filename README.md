# Learning GitHub Actions with Android

## Overview
This repository serves as a practical guide for learning how to implement GitHub Actions in an Android project. It uses a simple Jetpack Compose application that shows and hides a TextView as a sample project to demonstrate CI/CD workflows.

## Purpose
The main goals of this project are:
1. To understand the basics of GitHub Actions
2. To set up a CI/CD pipeline for an Android project
3. To learn how to automate build and test processes

## Sample Android App
The repository includes a basic Android app built with Jetpack Compose. The app simply displays a text that appears and disappears after a few seconds. While the app itself is not the focus, it serves as a realistic project setup for our GitHub Actions learning.

## GitHub Actions Workflow

### Workflow File
The heart of our GitHub Actions setup is the workflow file located at `.github/workflows/android_build.yml`. This YAML file defines the entire CI process.

### What the Workflow Does
1. **Trigger**: The workflow runs on every push and pull request to the main branch.
2. **Environment**: It sets up an Ubuntu latest environment for building the app.
3. **Steps**:
   - Checks out the code
   - Sets up JDK 17
   - Caches Gradle packages
   - Builds the project using Gradle

### Learning Points
- How to define workflow triggers
- Setting up a build environment
- Caching dependencies for faster builds
- Running Gradle tasks in CI environment

## How to Use This Repository

1. **Fork the Repository**: Start by forking this repository to your GitHub account.

2. **Enable GitHub Actions**: Go to the "Actions" tab in your forked repository and enable GitHub Actions if it's not already enabled.

3. **Make Changes**: Try making changes to the Android project or the workflow file to see how it affects the CI process.

4. **Watch the Action Run**: After pushing changes, go to the "Actions" tab to see your workflow in action.

5. **Experiment**: 
   - Try adding new steps to the workflow
   - Modify the build process
   - Add test running steps
   - Experiment with different events to trigger the workflow

## Extending the Workflow

Here are some ideas to extend the workflow as you learn:

1. Add a step to run unit tests
2. Implement a workflow for creating release builds
3. Set up notifications for workflow failures
4. Add a code quality check step (e.g., using ktlint)

## Resources for Learning More

- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Android CI Best Practices](https://developer.android.com/studio/projects/continuous-integration)
- [Gradle Build Tool](https://gradle.org/)

## Contributing

Feel free to contribute to this project if you have ideas for improving the learning experience or extending the GitHub Actions workflow.

## License

This project is open source and available under the [MIT License](LICENSE).

---

Happy Learning and Happy Coding! 🚀🤖

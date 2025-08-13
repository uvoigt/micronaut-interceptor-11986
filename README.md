# Demonstrates, that a non-public interceptor does not work.

Discussion: https://github.com/micronaut-projects/micronaut-core/discussions/11986

1. Run `./gradlew test` to see that the test will fail.
2. Make [TestInterceptor.java](src/main/java/test/TestInterceptor.java) public
3. Run `./gradlew test` again and see that it passes.

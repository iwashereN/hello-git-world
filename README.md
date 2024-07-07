# hello-git-world

## Instructions:

1. **Fork and Clone the Repository**

   - Fork this repository to your own GitHub account.
   - Clone your forked repository to your local machine.

2. **Initial Setup**

   - Navigate to the cloned repository on your local machine.
   - The repository contains a file named `Hello.java` with the following content:
     ```java
     public class Hello {
         public static void main(String[] args) {
             System.out.println("Hello, World!");
         }
     }
     ```

3. **Create a Branch and Make Changes**

   - Create a new branch named `feature-add-greeting`.
   - In the `feature-add-greeting` branch, modify the `Hello.java` file to include a new method that takes a string argument and prints a personalized greeting. Your updated `Hello.java` file might look like this:

     ```java
     public class Hello {
         public static void main(String[] args) {
             System.out.println("Hello, World!");
             greet("Student");
         }

         public static void greet(String name) {
             System.out.println("Hello, " + name + "!");
         }
     }
     ```

4. **Create Another Branch and Make Conflicting Changes**

   - Switch back to the `main` branch.
   - Create a new branch named `bugfix-correct-typo`.
   - In the `bugfix-correct-typo` branch, modify the `Hello.java` file to fix a typo or add a minor change. For example, you could update the main method to include a comment explaining its purpose:
     ```java
     public class Hello {
         public static void main(String[] args) {
             // Prints the classic "Hello, World!" message
             System.out.println("Hello, World!");
         }
     }
     ```

5. **Merge Branches and Resolve Conflicts**

   - Switch back to the `main` branch.
   - Attempt to merge the `feature-add-greeting` branch into `main`.
   - If there are merge conflicts, resolve them in your text editor. The final `Hello.java` file should ideally combine both changes:

     ```java
     public class Hello {
         public static void main(String[] args) {
             // Prints the classic "Hello, World!" message
             System.out.println("Hello, World!");
             greet("Student");
         }

         public static void greet(String name) {
             System.out.println("Hello, " + name + "!");
         }
     }
     ```

   - Commit the resolved changes.
   - While still on the `main` branch, attempt to merge the `bugfix-correct-typo` branch into `main`.
   - Resolve any merge conflicts that arise. The final `Hello.java` file should still combine both changes:

     ```java
     public class Hello {
         public static void main(String[] args) {
             // Prints the classic "Hello, World!" message
             System.out.println("Hello, World!");
             greet("Student");
         }

         public static void greet(String name) {
             System.out.println("Hello, " + name + "!");
         }
     }
     ```

   - Commit the resolved changes.

6. **Push Changes and Create a Pull Request**
   - Push your changes to your forked repository on GitHub.
   - Go to your forked repository on GitHub and create a pull request to merge your changes from `main` into the `main` branch of the original repository.

### Notes:

- The changes suggested in the branches are examples. Feel free to explore and make your own changes to practice and master the concepts.

Happy coding!

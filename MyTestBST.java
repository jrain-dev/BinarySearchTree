// Name:        Jordan Rainford
// Class:       CS 3305/Section#01
// Term:        Spring 2024
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE Name:    IntelliJ IDEA

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MyTestBST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        BST<String> sTree = new BST<String>();
        BST<Integer> iTree = new BST<Integer>();

        boolean stringTree = false;
        boolean intTree = false;
        boolean hasRun0 = false;

        while (option != 10) {
            System.out.println("\n----------------MAIN MENU---------------\n" +
                    "0. Enter Tree Data Type (integer or string)\n" +
                    "1. Insert Data Element\n" +
                    "2. Delete Data Element\n" +
                    "3. Search for Data Element\n" +
                    "4. Print Tree Size\n" +
                    "5. Path from Root to Data Element\n" +
                    "6. Check if Empty Tree\n" +
                    "7. Print Preorder Traversal\n" +
                    "8. Print Inorder Traversal\n" +
                    "9. Print Postorder Traversal\n" +
                    "10. Exit program\n\n" +
                    "Enter option number:");

            if (!hasRun0) {
                option = 0;
            }
            else {
                option = Integer.parseInt(sc.nextLine());
            }

            if (option > 10 || option < 0) {
                System.out.println("Please enter a valid menu option.");
            }
            else {
                switch (option){
                    case 0: //Selects the datatype for the tree
                        hasRun0 = false;
                        System.out.println("\nPlease enter your tree's Data Type (integer or string): ");
                        String dataType = sc.nextLine().toLowerCase();

                        if (Objects.equals(dataType, "string")) {
                            hasRun0 = true;
                            stringTree = true;
                            System.out.println("\nYour tree will now contain Strings.");
                        }
                        else if (Objects.equals(dataType, "integer")) {
                            hasRun0 = true;
                            intTree = true;
                            System.out.println("\nYour tree will now contain Integers.");
                        }
                        else {
                            System.out.println("Invalid input, please try again.");
                        }
                        break;

                    case 1: //inserts a tree element
                        if (intTree){ //checks if tree holds integers or strings
                            System.out.println("Please enter an integer data element: ");
                            int intElement = Integer.parseInt(sc.nextLine());

                            System.out.print("\nBST before inserting " + intElement +
                                    " (Inorder): \t");
                            if (iTree.isEmpty()) { //checks if tree is empty
                                System.out.print("null");
                            }
                            else {
                                iTree.inorder();
                            }

                            iTree.insert(intElement);

                            System.out.print("\nBST after inserting " + intElement +
                                    " (Inorder): \t");
                            iTree.inorder();

                            System.out.println(" ");
                        }
                        else {
                            System.out.println("Please enter a string data element: ");
                            String stringElement = sc.nextLine();

                            System.out.print("\nBST before inserting " + stringElement +
                                    " (Inorder): \t");
                            if (sTree.isEmpty()) { //checks if tree is empty
                                System.out.print("null");
                            }
                            else {
                                sTree.inorder();
                            }
                            sTree.insert(stringElement);

                            System.out.print("BST after inserting " + stringElement +
                                    " (Inorder): \t");
                            sTree.inorder();

                            System.out.println(" ");
                        }
                        break;

                    case 2: //deletes a tree element
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){
                                System.out.println("Tree is empty.");
                            }
                            else{
                                try {
                                    System.out.println("Please enter the integer data element you'd like to delete: ");
                                    int iDeleteElement = Integer.parseInt(sc.nextLine());

                                    System.out.print("\nBST before deleting " + iDeleteElement +
                                            " (Inorder): \t");
                                    iTree.inorder();

                                    iTree.delete(iDeleteElement);

                                    System.out.print("\nBST after deleting " + iDeleteElement +
                                            " (Inorder): \t");
                                    if (iTree.isEmpty()) { //checks if tree is empty
                                        System.out.print("null");
                                        System.out.println(" ");
                                    }
                                    else {
                                        iTree.inorder();
                                        System.out.println(" ");
                                    }
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        else {
                            if (sTree.isEmpty()){
                                System.out.println("Tree is empty.");
                            }
                            else{
                                try {
                                    System.out.println("Please enter the string data element you'd like to delete: ");
                                    String sDeleteElement = sc.nextLine();

                                    System.out.print("\nBST before deleting " + sDeleteElement +
                                            " (Inorder): \t");
                                    sTree.inorder();

                                    sTree.delete(sDeleteElement);

                                    System.out.print("\nBST after deleting " + sDeleteElement +
                                            " (Inorder): \t");
                                    if (sTree.isEmpty()) { //checks if tree is empty
                                        System.out.print("null");
                                        System.out.println(" ");
                                    }
                                    else {
                                        sTree.inorder();
                                        System.out.println(" ");
                                    }
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        break;

                    case 3:
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else{
                                try {
                                    System.out.println("Please enter the integer data element you'd like to find: ");
                                    int findElement = Integer.parseInt(sc.nextLine());

                                    System.out.println("Search for " + findElement + "?  \t" + iTree.search(findElement));
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }

                            }
                        }
                        else {
                            if (sTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else{
                                try {
                                    System.out.println("Please enter the string data element you'd like to find: ");
                                    String findElement = sc.nextLine();

                                    System.out.println("Search for " + findElement + "? \t" + sTree.search(findElement));
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        break;

                    case 4:
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else{
                                System.out.println("Tree size: \t" + iTree.size);
                            }
                        }
                        else {
                            if (sTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else{
                                System.out.println("Tree size: \t" + sTree.size);
                            }
                        }
                        break;

                    case 5:
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else{
                                try {
                                    System.out.println("Please enter the data element you'd like to find the path for: ");
                                    int pathElement = Integer.parseInt(sc.nextLine());

                                    ArrayList<BST.TreeNode<Integer>> pathway = iTree.path(pathElement);

                                    System.out.print("\nPath from root to " + pathElement + ": \t");
                                    for (int i = 0; pathway != null && i < pathway.size(); i++) {
                                        System.out.print(pathway.get(i).element + " ");
                                    }

                                    System.out.println(" ");
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        else {
                            if (sTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else{
                                try {
                                    System.out.println("Please enter the data element you'd like to find the path for: ");
                                    String pathElement = sc.nextLine();

                                    ArrayList<BST.TreeNode<String>> pathway = sTree.path(pathElement);

                                    System.out.print("\nPath from root to " + pathElement + ": \t");
                                    for (int i = 0; pathway != null && i < pathway.size(); i++){
                                        System.out.print(pathway.get(i).element + " ");
                                    }

                                    System.out.println(" ");
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        break;

                    case 6: //checks if tree is empty
                        if (intTree){ //checks if tree holds integers or strings
                            System.out.println("Is empty tree? " + iTree.isEmpty());
                        }
                        else {
                            System.out.println("Is empty tree? " + sTree.isEmpty());
                        }
                        break;

                    case 7:
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else {
                                System.out.print("\nPreorder: ");
                                iTree.preorder();
                            }
                        }
                        else {
                            if (sTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else {
                                System.out.print("\nPreorder: ");
                                sTree.preorder();
                            }
                        }
                        break;

                    case 8:
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else {
                                System.out.print("\nInorder: ");
                                iTree.inorder();
                            }
                        }
                        else {
                            if (sTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else {
                                System.out.print("\nInorder: ");
                                sTree.inorder();
                            }
                        }
                        break;

                    case 9:
                        if (intTree){ //checks if tree holds integers or strings
                            if (iTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else {
                                System.out.print("\nPostorder: ");
                                iTree.postorder();
                            }
                        }
                        else {
                            if (sTree.isEmpty()){ //checks if tree is empty
                                System.out.println("Tree is empty.");
                            }
                            else {
                                System.out.print("\nPostorder: ");
                                sTree.postorder();
                            }
                        }
                        break;

                    case 10: //Exits program
                        System.out.println("Goodbye!");
                        break;

                }
            }
        }
    }
}

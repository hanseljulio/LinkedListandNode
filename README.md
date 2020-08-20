# LinkedListandNode
Assassin game and LinkedList Generic practice
Created June 2nd, 2019

-------------------------------------------------------------------------------

## Overview
This is a program that contains the "Assassin" game and practice for Generic Linkedlists.

"Assassin" is basically a battle royale-like game where players will kill off each other until the player with the highest point wins.

-------------------------------------------------------------------------------

### Classes

1. Assassin.java - 
 * Data structure for name and skill level, also main file for Assassin game
 * Constructor: Assassin(String name, int skillLevel)
   * This constructor will create the player's name and skill level that is set to the given values
 * Functions:
   * getName()
     * This function will return the name of the player
   * getSkillLevel()
     * This function will return the skill level of the player
   * toString()
     * This function will return the name and skill level of the player as a string
     
     
2. AssassinManager.java
 * This class handles the game, looks for the next potential victim and recaps the game
 * Constructor: AssassinManager(String filePath) throws IOException
   * This constructor takes in a text file and finds the name and skill of the player from the file
 * Functions:
   * getNextVictim()
     * This function will return the next "victim" that the player will target
   * play()
     * This function will handle the flow of the game, from its weapon, target, and removal of players
   * deathRecap()
     * This function will return the recap of the game


3. LinkedList.java
 * This class contains the linked list data structure and is built with the E type generic
 * Functions:
   * add(Node<E> node)
     * This function will add a node at the end the linked list
   * add(Node<E> node, int index)
     * This function will add a node at the given index of the linked list
   * remove(E value)
     * This function will remove the value given from the linked list
   * exists(Node<E> node)
     * This function will check whether the given node exists within the linked list
   * equals(Object o)
     * This function will check for equality between the linked lists
   * toString()
     * This function will return the result as a string
   * size()
     * This function will return the size of the linked list
   * get(int index)
     * This function return the data at the given index
   * getFirst()
     * This function will return the first data
   * getParent(Node<E> node)
     * This function will return the parent of the given node
   * truncateList(E value)
     * This function will delete the given value from the linked list
   * getLast()
     * This function will return the last data in the linked list


4. Main.java
 * Contains the main file for the linked list practice
 * Functions:
   * nodeEqualTest(Node<?> node, Node<?> node2), equalsTest(LinkedList<E> list, LinkedList<E> node)
     * These function tests the functionality of the equals method
   * addOne(LinkedList<E> node), addTwo(LinkedList<E> node)
     * These function tests the functionality of the add method
   * indexTest(LinkedList<E> node, int value, int index)
     * These function tests the functionality of the add method to the given index
   * removeElement(LinkedList<E> node, E value)
     * This function tests the functionality of the remove function
   * existTest(LinkedList<E> node, E value)
     * This function tests the functionality of the exist function
 
 
5. MorePractice.java
 * As the title implies, this class contains another main file for the linked list practice
 * Function: mergeLists(LinkedList<E> list1, LinkedList<E> list2)
   * This function merges two given linked lists into a single linked list


6. Node.java
 * Contains the data structure for the Node class
 * Constructors:
   * Node(E data)
     * This constructor will create a new node with the given data
   * Node (E data, Node<E> next)
     * This constructor will create a new node with the given data for the given node
 * Functions:
   * getNext()
     * This function will return the next node in the linked list
   * setNext(Node<E> next)
     * This function will set the given node to be next node in the linked list
   * equals(Object o)
     * This function will check for equality between the nodes
   * toString()
     * This function will return the data as a string
   * getData()
     * This function will return the data

 
 
 
 
 







<h1>PizzaBili</h1>
<p>PizzaBili is a Java application designed to manage and calculate the cost of different types of pizzas. The project includes functionalities for standard and deluxe pizzas with various toppings and sizes.</p>

<h2>Project Structure</h2>
<p>The project consists of the foliowing main components:</p>
<ul>
<li>src/: Contains the source code files.</li>
<ul>
<li>DeluxPizza.java: Class for deluxe pizza that inherits from the base pizza class.</li>
<li>Main.java: Main class to run the application.</li>
<li>Pizza.java: Base class for standard pizza.</li>
</ul>
  
<li>out/: Contains the compiled Java classes.</li>
<ul>
<li>DeluxPizza.class: Compiled class for deluxe pizza.</li>
<li>Main.class: Compiled main class.</li>
<li>Pizza.class: Compiled base pizza class.</li>
</ul>

<li>.git/: Directory containing Git version control files.</li>

<li>.gitignore: File specifying which files and directories to ignore in the Git repository.</li>

<li>PizzaBili.iml: InteliiJ IDEA module file.</li>
</ul>

<h3>Prerequisites</h3>
<ul>
<li>Java Development Kit (JDK) 8 or higher</li>
<li>Git (for version control)</ul>
</ul>

<h3>Getting Started</h3>

<ol>
<li>Clone the repository:</li>
git clone <repository-url>

<li>Navigate to the project directory:</li>
cd PizzaBili/PizzaBili

<li>Compile the Java files:</li>
javac src/*.java -d out/production/PizzaBili

<li>Run the application:</li>
java -cp out/production/PizzaBili
</ol>

<h3>Main Classes and Functionality</h3>
<ul>
<li>Pizza.java</li>
<ul> 
  <li>Represents a standard pizza.</li>
  <li>Includes attributes for size, toppings, and cost.</li>
  <li>Methods to calculate and return the cost of the pizza.</li>
</ul>

<li>DeluxPizza.java</li>
<ul>
  <li>Inherits from the Pizza class.</li>
  <li>Adds extra features specific to deluxe pizzas.</li>
  <li>Overrides methods as necessary to account for additional costs.</li>
</ul>

<li>Main.java</li>
<ul>
  <li>Contains the main method to run the application.</li>
  <li>Demonstrates the creation of pizza objects and the calculation of their costs.</li>
</ul>
</ul>

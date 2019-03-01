CRC

  1. - Class name : 
     Customer<br>
     - Responsibilites : <br>
     Give a customer's infromation to Front Desk Receoptionist.<br>
     Get status through the Cell Phone.<br>
     Send decision through the Cell Phone.<br>
     - Collaborator : <br> 
     Front Desk Receptionist, Cell Phone
     
  2. - Class name :
       Front Desk Receptionist<br>
     - Responsibilities : <br>
     Add customer’s information to POS Machine.<br>
     Request table setting to Server.<br>
     Conduct Customers to table.<br>
     - Colloborator : <br>
       Customer, Server, POS Machine<br>
  3. - Class name : Server<br>
     - Responsibilities : <br>
     Check the table status.<br>
     Send table status to Front Desk Receptionist.<br>
     - Collaborator : <br>
     Front Desk Receptionist, Table<br>
  4. - Classname : Table<br>
     - Responsibilities : <br>
       Change state.<br>
     - Collaborators : <br>
     Server<br>
  5. - Classname :
  Cellphone<br>
     - Responsibilities : <br>
     Give a table status to the Customer.<br>
      Reply SMS to POS Machine.<br>
     - Collaborators : Customer, POS Machine<br>
  6. - Classname : POS Machine<br>
     - Responsibilities : <br>
     Get Customer’s information from the Front Desk Receptionist.<br>
     Send Message to Cell Phone.<br>
     - Collaborators : <br>
     Front Desk Receptionist, Cellphone of Customers<br>


Design Pattern

 ⁃	Observer Pattern
    The Front Desk Receptionist is the Observer and the Server is the Subject.
    When table status changed, the Server let the Front Desk Receptionist knows status of each table.
    
 ⁃	State Pattern
    When table status changed, the Server gives a state of the table to the Front Desk Receptionist.
    Also, Front Desk Receptionist send a message to the Customer through the POS machine according to table status.

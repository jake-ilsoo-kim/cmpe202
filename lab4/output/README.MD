CRC

  1. Class name : Customer
     Responsibilites : Give a customer's infromation to Front Desk Receoptionist,
                       Get status through the Cell Phone.
                       Send decision through the Cell Phone.
     Collaborator : Front Desk Receptionist, Cell Phone
  2. Class name : Front Desk Receptionist
     Responsibilities : Add customer’s information to POS Machine.
                        Request table setting to Server.
                        Conduct Customers to table.
     Colloborator : Customer, Server, POS Machine
  3. Class name : Server
     Responsibilities : Check the table status.
                        Send table status to Front Desk Receptionist.
     Collaborator : Front Desk Receptionist, Table
  4. Classname : Table
     Responsibilities : Change state.
     Collaborators : Server
  5. Classname : Cellphone
     Responsibilities : Give a table status to the Customer.
                        Reply SMS to POS Machine.
     Collaborators : Customer, POS Machine
  6. Classname : POS Machine
     Responsibilities : Get Customer’s information from the Front Desk Receptionist.
                        Send Message to Cell Phone.
     Collaborators : Front Desk Receptionist, Cellphone of Customers


Design Pattern

 ⁃	Observer Pattern
    The Front Desk Receptionist is the Observer and the Server is the Subject.
    When table status changed, the Server let the Front Desk Receptionist knows status of each table.
    
 ⁃	State Pattern
    When table status changed, the Server gives a state of the table to the Front Desk Receptionist.
    Also, Front Desk Receptionist send a message to the Customer through the POS machine according to table status.

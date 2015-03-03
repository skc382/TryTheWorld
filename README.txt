Please find my responses to your questions:

1. Describe the process by which typing "http://www.yahoo.com" in the address bar of your browser results in a the Yahoo! homepage rendering.
- Before browser begins a connection request to "http://www.yahoo.com", it needs to get the IP address of "http://www.yahoo.com".
- Browser creates a DNS request(Domain Name Server request), which will be encapsulated with UDP segments in Transport layer, then with IP datagrams in Network layer, then with Frames in datalink layer. To Route the packets to DNS server we need the address of the DNS server. So an ARP request is sent to the nearest known Router, which will forward the MAC address of the Router interface. Once the request reaches the DNS server, it replies with the IP address of "http://www.yahoo.com".
- The client browser will then create a TCP socket connection request and sends it to "http://www.yahoo.com" Server as described before. Upon receipt, "http://www.yahoo.com" Server will reply with acknowledgment and connection will be established.
- The browser then sends HTTP request into the TCP socket connection which will be routed to "http://www.yahoo.com" Server and a HTTP response will be received, thus establishing data transfer.

2) What is a deadlock? What are some ways of preventing it? 
- A deadlock is a situation where several processes are blocked by other processes as they wait for each other to obtain a resource.
There are three techniques of handling deadlocks:
Deadlock prevention
Deadlock avoidance
Deadlock detection

3. In the context of a relational database, what is the difference between a clustered and a non-clustered index?
- A clustered index determines the order in which the rows of a table are stored on disk. If a table has a clustered index, then the rows of that table will be stored on disk in the same exact order as the clustered index. Clustered index can access the row directly since it is being stored in the same order as the clustered index itself. Hence, reading from a clustered index is generally faster.
- A non-clustered index will store both the value of the Primary key AND a pointer to the row in the table where that value is actually stored. So with a non-clustered index extra work is required to follow the pointer to the row in a table to retrieve any other desired values.

4) Write a method to calculate the maximum possible profit I could have made by buying low and selling high given an array of mutual fund NAVs (end of day prices) for every day in a time interval.  For example, for the array [7,24,8,15,2,20], the maximum profit would have been 18, by buying at 2 on day 5 and selling at 20 on day 6. 
  a) What is the run time complexity of your solution (Big-O)?
---  Solution presented under maxProfit Project in Github.

5) Write a program to simulate picking a marble out of a bag of colored marbles without replacement (marbles are not added back to the bag after selecting them). Assume we have 3 colors: red, green, and blue. Your program should print out the color of each marble selected until the bag is empty.
  a) What is the runtime complexity of your selectMarble method?
  b) How would you change your program, if at all, if you had thousands of marbles?
  c) How would you change your program, if at all, if you had thousands of colors?
 ---  Solution presented under SelectMarbles Project in Github.

 3) Given a dictionary with 1,000 words (the words are in alphabetical order given it's a dictionary), write a program that prints all anagrams found. For example, using the following dictionary as input: [ "ACT", "ANTS", "ART", "BAT", "BAR", "CAT", "DOOR", "RAT", "TAB", "TAR" ] should print ACT: CAT, ART: RAT, TAR, BAT: TAB.
 ---  Solution presented under Anagrams Project in Github.

 6) How would you design the game Battleship? 
  a) What classes would you need? 
  - We need a BattleShip Class - having properties of battle ship like ammo, cannon, speed, movement like up, down, left, write.
  - ocean class - Which is a container class for several battleships. It tracks the location of each battle ship as they move. It should also have setLocation method/methods to change the location of battle ship as delegated from main class.
  - Battle class - this is the main class which creates battleships and controls their movements across the ocean.

  b) What would the fire method look like? How would I know if I hit or miss?
  - Battle ships can be multiple independent threads. They may have a method called Aim(). Aim always check whether 10 positions in front of the battle ship is empty or not. if not empty, it will get the battleship's id from ocean class and invokes fire method.

  Aim()
  		Keep checking 10 positions in front of the ship for emptiness
  			if not empty
  				get battleship id from ocean class
  				pass the id to fire method and invoke fire method.

  Fire(BattleShip EnemyShip)
  - Every battleShip will have a counter called shipLife. if it gets fired upon this counter will be decremented.
  - EnemyShip.shipLife -- ;
  - Print(Fired on EnemyShip.id);

  c) How would you determine whether a ship has been sunk?
  - When the shipLife counter reaches to zero, ship will be sunk. 
  - have a boolean isSunk. and set it to true. inform ocean class about the ship being sunk, so that ocean class can 
     remove the ship from its list.
     
  d) Write a program that "plays" Battleship. Note: Use the fact that a computer is great a running calculations quickly
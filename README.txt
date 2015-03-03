Please find my responses to your questions:

1. Describe the process by which typing "http://www.yahoo.com" in the address bar of your browser results in a the Yahoo! homepage rendering.
- Before browser begins a connection request to "http://www.yahoo.com", it needs to get the IP address of "http://www.yahoo.com".
- Browser creates a DNS request(Domain Name Server request), which will be encapsulated with UDP segments in Transport layer, then with IP datagrams in Network layer, then with Frames in datalink layer. To Route the packets to DNS server we need the address of the DNS server. So an ARP request is sent to the nearest known Router, which will forward the MAC address of the Router interface. Once the request reaches the DNS server, it replies with the IP address of "http://www.yahoo.com".
- The client browser will then create a TCP socket connection request and sends it to "http://www.yahoo.com" Server as described before. Upon receipt, "http://www.yahoo.com" Server will reply with acknowledgment and connection will be established.
- The browser then sends HTTP request into the TCP socket connection which will be routed to "http://www.yahoo.com" Server and a HTTP response will be received, thus establishing data transfer.

2) What is a deadlock? What are some ways of preventing it? 
- A deadlock is a situation when several processes are blocked by other processes as they wait for each other to obtain a resource.
There are three techniques of handling deadlocks:
Deadlock prevention
Deadlock avoidance
Deadlock detection

In the context of a relational database, what is the difference between a clustered and a non-clustered index?
A clustered index determines the order 
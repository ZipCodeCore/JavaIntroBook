# Chat Project

what is a `socket`? 
Where did the idea of `socket` come from? (look it up, research it.)

_Write it down in a `Notes.md` file._

## Requirements

- Create a chat application that allows multiple users to connect to a server and send messages to each other.
- The server should be able to handle multiple connections at the same time.
- The server should be able to broadcast messages to all connected clients.
- The server should be able to handle messages from clients and send them to all other clients.

Does the code presented here fulfill the requirements above? If so why? If not, why not?

_Add your answers to the `Notes.md` file._

Describe how the threading works. What will happen if hundreds of clients connect all at once? Will the server be able to handle it?
(Write some code to prove/disprove that the server can handle it.) Yes, really, write some code that creates _hundreds_ of clients and tests the server.

_Add your observations of the exhibited behavior to the `Notes.md` file._

## Hints of things to Research

- You can use the `socket` module to create a server and client.
- You can use the `threading` module to handle multiple connections.
- You can use the `select` module to handle multiple connections.
- You can use the `asyncio` module to handle multiple connections.

Now can you actually use these technologies to replace the server?

- You can use the `socketserver` module to create a server.
- You can use the `http.server` module to create a server.
- You can use the `websockets` module to create a server.
- You can use the `socketio` module to create a server.


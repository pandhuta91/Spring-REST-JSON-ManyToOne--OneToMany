curl -H "Content-Type: application/json" -X POST -d '{"description":"First Ticket"}' http://localhost:9097/tickets
curl -H "Content-Type: application/json" -X POST -d '{"description":"Second Ticket"}' http://localhost:9097/tickets
curl -H "Content-Type: application/json" -X POST -d '{"description":"Third Ticket"}' http://localhost:9097/tickets

curl -H "Content-Type: application/json" -X POST -d '{"text":"First Ticket, first comment"}' http://localhost:9097/tickets/1/comments
curl -H "Content-Type: application/json" -X POST -d '{"text":"First Ticket, second comment"}' http://localhost:9097/tickets/1/comments
curl -H "Content-Type: application/json" -X POST -d '{"text":"First Ticket, third comment"}' http://localhost:9097/tickets/1/comments

curl -H "Content-Type: application/json" -X POST -d '{"text":"Second Ticket, first comment"}' http://localhost:9097/tickets/2/comments
curl -H "Content-Type: application/json" -X POST -d '{"text":"Second Ticket, second comment"}' http://localhost:9097/tickets/2/comments
curl -H "Content-Type: application/json" -X POST -d '{"text":"Second Ticket, third comment"}' http://localhost:9097/tickets/2/comments

curl -H "Content-Type: application/json" -X POST -d '{"text":"Third Ticket, first comment"}' http://localhost:9097/tickets/3/comments
curl -H "Content-Type: application/json" -X POST -d '{"text":"Third Ticket, second comment"}' http://localhost:9097/tickets/3/comments
curl -H "Content-Type: application/json" -X POST -d '{"text":"Third Ticket, third comment"}' http://localhost:9097/tickets/3/comments

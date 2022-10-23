# Privacy levels

1 PR1 > Just the user
2 PR2 > Just the friends I choose to access the content
3 PR3 > Just the friends on my friendlist
4 PU1 > Just the friends of my friends
5 PU2 > Just registered users
6 PU3 > Everyone can access the content

      <p>Post reported: <span th:text="${post.reported}"></span></p> 
      --ADD COLUMN created_at TIMESTAMPTZ DEFAULT Now(),
      --ADD COLUMN created_at varchar(50) NOT NULL,
      <p>Post created at: <span th:text="${post.created_at}"></span></p>
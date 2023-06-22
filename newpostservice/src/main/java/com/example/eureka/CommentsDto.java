package com.example.eureka;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommentsDto {
	int cid;
	String commenter;
	int pid;
	String comment;
}

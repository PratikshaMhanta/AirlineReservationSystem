package com.demo.Entity;

import javax.persistence.Column;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Admin 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id",length= 20)
    private Long ID;
    @Column(name="UserName",length= 30)
    private String username;
    @Column(name="Passsword",length = 30)
    private String password;
	
}
    
    


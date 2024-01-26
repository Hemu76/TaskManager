package com.taskManager.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.taskManager.beans.Home;

@Component
public class HomeDAO {
	
	@Autowired
	JdbcTemplate jt;
	
	public List<Home> get() {
	    List<Home> hh = jt.query("select * from hemu", (rs, rownum) -> {
	        Home home = new Home();
	        home.setRno(rs.getInt(1));
	        return home;
	    });
	    return hh;
	}
}

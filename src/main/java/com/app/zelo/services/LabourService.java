package com.app.zelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.app.zelo.dao.*;
import com.app.zelo.models.Labour;

@Service
public class LabourService {

    @Autowired
    LabourDao labourdao;

    public LabourDao getLabourdao() {
        return labourdao;
    }

    public void setLabourdao(LabourDao labourdao) {
        this.labourdao = labourdao;
    }

    public List<Labour> getAllLabours() {
		return labourdao.findAll();
    }
    
    public Labour getLabourById(int id) {
		return labourdao.findById(id).orElse(new Labour());
    }
    
    public List<Labour> getAllLaboursByName(String name) {
		return labourdao.findByNameContains(name);
    }

	public void addLabour(Labour labour) {
		labourdao.save(labour);
	}

	public void deleteById(int id) {
		labourdao.deleteById(id);
	}

	public String getLatestId() {
		return  labourdao.getLatestId();
		
	}

}

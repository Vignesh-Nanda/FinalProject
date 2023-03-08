package com.example.demo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Hospital;
import com.example.demo.Repository.HospitalRepo;

@Service
public class HospitalSer {

	@Autowired
	private HospitalRepo hr;

	public Hospital addDetails(Hospital h) {
		return hr.save(h);
	}

	public List<Hospital> getDetails() {
		return hr.findAll();
	}

	public void delDetails(int id) {
		hr.deleteById(id);
	}

	public Hospital update(int id, Hospital h) {
		Hospital hp = hr.findById(id).get();
		if (Objects.nonNull(hp) && (Objects.nonNull(h.getFname()))) {
			hp.setFname(h.getFname());
		}
		if (Objects.nonNull(hp) && (Objects.nonNull(h.getLname()))) {
			hp.setLname(h.getLname());
		}
		if (Objects.nonNull(hp) && (Objects.nonNull(h.getEmail()))) {
			hp.setEmail(h.getEmail());
		}
		if (Objects.nonNull(hp) && (Objects.nonNull(h.getMstatus()))) {
			hp.setMstatus(h.getMstatus());
		}
		if (Objects.nonNull(hp) && (Objects.nonNull(h.getGen()))) {
			hp.setGen(h.getGen());
		}
		if (Objects.nonNull(hp) && (h.getAge() != 0)) {
			hp.setAge(h.getAge());
		}
		if (Objects.nonNull(hp) && (h.getEcon() != 0)) {
			hp.setEcon(h.getEcon());
		}
		if (Objects.nonNull(hp) && (h.getMob() != 0)) {
			hp.setMob(h.getMob());
		}
		if (Objects.nonNull(hp) && (h.getZip() != 0)) {
			hp.setZip(h.getZip());
		}
		if (Objects.nonNull(hp) && (Objects.nonNull(h.getAdd()))) {
			hp.setAdd(h.getAdd());
		}

		return hr.save(hp);
	}

	public Hospital getById(int id) {
		Hospital obj = hr.findById(id).get();
		return obj;
	}
}

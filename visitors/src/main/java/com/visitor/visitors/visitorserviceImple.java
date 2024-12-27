package com.visitor.visitors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class visitorserviceImple implements visitorservice {

    @Autowired
    private visitorRepository visitorRepository;

    @Override
    public List<Visitor> readVisitors() {
        List<visitorEntity> vs = visitorRepository.findAll();
        List<Visitor> visitors = new ArrayList<>();
        for (visitorEntity v : vs) {
            Visitor visitor = new Visitor();
            visitor.setVisitor_id(v.getVisitor_id());
            visitor.setVisitor_name(v.getVisitor_name());
            visitor.setVisiting_room(v.getVisiting_room());
            visitor.setVisiting_date(v.getVisiting_date());
            visitor.setVisitor_number(v.getVisitor_number());

            visitors.add(visitor);

        }
        return visitors;
    }

    @Override
    public boolean deleteVisitor(Integer visitor_id) {
        visitorEntity ve= visitorRepository.findById(visitor_id).get();
        visitorRepository.delete(ve);
        return true;

    }

    @Override
    public String createVisitor(Visitor visitor) {
        visitorEntity ve = new visitorEntity();
        BeanUtils.copyProperties(visitor, ve);
        visitorRepository.save(ve);
        return "Successfully Saved data";

    }

    @Override
    public String updateVisitor(int id, Visitor visitor) {
        visitorEntity ve= visitorRepository.findById(id).get();
        ve.setVisitor_name(visitor.getVisitor_name());
        ve.setVisiting_date(visitor.getVisiting_date());
        ve.setVisiting_room(visitor.getVisiting_room());
        ve.setVisitor_number(visitor.getVisitor_number());
        visitorRepository.save(ve);
        return "Data updated successfully!!";
    }

    public Visitor readVisitor(int id) {
        visitorEntity ve= visitorRepository.findById(id).get();
        Visitor visitor = new Visitor();
        BeanUtils.copyProperties(ve,visitor);

                return visitor;
       
    }

    // @Override
    // public Visitor getVisitorByName(String visitor_name) {
    //    visitorEntity ve = visitorRepository.findByName(visitor_name).get();
    //    Visitor visitor = new Visitor();
    //    BeanUtils.copyProperties(ve, visitor);
    //    return visitor;

    // }

}

package com.example.demo.services;

import com.example.demo.entity.ProductsEntity;
import com.example.demo.entity.SectionsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionsService {


    @Autowired
    ISectionService iSectionService;

    public List<SectionsEntity> loadAllSections() {
        return (List<SectionsEntity>) iSectionService.findAll();
    }
}
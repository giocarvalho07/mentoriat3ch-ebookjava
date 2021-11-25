package com.ebookjava.service;

import com.ebookjava.domain.EbookJava;
import com.ebookjava.repository.EbookJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookJavaService {

    @Autowired
    EbookJavaRepository ebokEbookJavaRepository;

    public void criarLead(EbookJava ebookJava){
        ebokEbookJavaRepository.save(ebookJava);
    }

    public Iterable<EbookJava> exibirPageEbook(){return ebokEbookJavaRepository.findAll();
    }
}

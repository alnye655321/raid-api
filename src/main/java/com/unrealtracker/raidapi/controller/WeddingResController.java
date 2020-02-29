package com.unrealtracker.raidapi.controller;

import com.unrealtracker.raidapi.exception.ResourceNotFoundException;
import com.unrealtracker.raidapi.model.WeddingRes;
import com.unrealtracker.raidapi.repository.WeddingResRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class WeddingResController {

    @Autowired
    private WeddingResRepository WeddingResRepository;

    @GetMapping("/wedding")
    public Page<WeddingRes> getWeddingRess(Pageable pageable) {
        return WeddingResRepository.findAll(pageable);
    }

//    @GetMapping("/WeddingRessalt")
//    public Page<WeddingRes> getWeddingRessAlt(Pageable pageable) {
//        Page<WeddingRes> all = WeddingResRepository.findAll(pageable);
//        all.stream().forEach(e -> System.out.println(e.getTitle()));
//        all.forEach(e -> System.out.println(e.getTitle()));
//
//        return WeddingResRepository.findAll(pageable);
//    }



    @PostMapping("/WeddingRess")
    public WeddingRes createWeddingRes(@Valid @RequestBody WeddingRes WeddingRes) {
        return WeddingResRepository.save(WeddingRes);
    }

//    @PutMapping("/WeddingRess/{WeddingResId}")
//    public WeddingRes updateWeddingRes(@PathVariable Long WeddingResId,
//                                   @Valid @RequestBody WeddingRes WeddingResRequest) {
//        return WeddingResRepository.findById(WeddingResId)
//                .map(WeddingRes -> {
//                    WeddingRes.setTitle(WeddingResRequest.getTitle());
//                    WeddingRes.setDescription(WeddingResRequest.getDescription());
//                    WeddingRes.setUserName(WeddingResRequest.getUserName());
//                    WeddingRes.setSessionId(WeddingResRequest.getSessionId());
//                    return WeddingResRepository.save(WeddingRes);
//                }).orElseThrow(() -> new ResourceNotFoundException("WeddingRes not found with id " + WeddingResId));
//    }


//    @DeleteMapping("/WeddingRess/{WeddingResId}")
//    public ResponseEntity<?> deleteWeddingRes(@PathVariable Long WeddingResId) {
//        return WeddingResRepository.findById(WeddingResId)
//                .map(WeddingRes -> {
//                    WeddingResRepository.delete(WeddingRes);
//                    return ResponseEntity.ok().build();
//                }).orElseThrow(() -> new ResourceNotFoundException("WeddingRes not found with id " + WeddingResId));
//    }


}

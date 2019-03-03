package com.unrealtracker.raidapi.controller;

import com.unrealtracker.raidapi.exception.ResourceNotFoundException;
import com.unrealtracker.raidapi.model.World;
import com.unrealtracker.raidapi.repository.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class WorldController {

    @Autowired
    private WorldRepository worldRepository;

    @GetMapping("/worlds")
    public Page<World> getWorlds(Pageable pageable) {
        return worldRepository.findAll(pageable);
    }


    @PostMapping("/worlds")
    public World createWorld(@Valid @RequestBody World world) {
        return worldRepository.save(world);
    }

}

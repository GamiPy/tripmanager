package com.example.tripmanager.controller;

import com.example.tripmanager.entity.Transport;
import com.example.tripmanager.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class TransportController {

    @Autowired
    private TransportService transportService;

    @PostMapping("/transport/{tripId}")
    public Transport addNewTransport(@PathVariable("tripId") Long id,
                                     @RequestBody Transport transport) {

        return transportService.saveTransport(transport, id);
    }

    @GetMapping("/transports/{tripId}")
    public List<Transport> showTransports(@PathVariable("tripId") Long tripId) {

        return transportService.showTransports(tripId);
    }

    // deleteTransport

    //updateTransport
}
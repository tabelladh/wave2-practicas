package com.example.Joyeria.Service;


import com.example.Joyeria.Model.Jewel;

import java.util.List;

public interface IJewelService {

    Jewel createJewel(Jewel jewel);

    List<Jewel> getAllJewels();

    Jewel getJewelById(Long id);

    void deleteJewel(Long id);

    Jewel updateJewel(Long id, Jewel jewel);

}

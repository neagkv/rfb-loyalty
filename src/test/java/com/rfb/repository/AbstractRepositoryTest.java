package com.rfb.repository;

import com.rfb.domain.RfbEventAttendance;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractRepositoryTest {

    @Autowired
    RfbLocationRepository rfbLocationRepository;

    @Autowired
    RfbEventRepository rfbEventRepository;

    @Autowired
    RfbEventAttendanceRepository rfbEventAttendanceRepository;

    @Autowired
    RfbUserRepository rfbUserRepository;
}

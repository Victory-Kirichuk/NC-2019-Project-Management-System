package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.AttachEntity;


import java.util.List;

public interface AttachService {
List<AttachEntity> findAll();
AttachEntity save(AttachEntity attachEntity);

}

import { TestBed } from '@angular/core/testing';

import { TaskPriorityService } from './task-priority.service';

describe('TaskPriorityService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TaskPriorityService = TestBed.get(TaskPriorityService);
    expect(service).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EdProjectPageComponent } from './ed-project-page.component';

describe('EdProjectPageComponent', () => {
  let component: EdProjectPageComponent;
  let fixture: ComponentFixture<EdProjectPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EdProjectPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EdProjectPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

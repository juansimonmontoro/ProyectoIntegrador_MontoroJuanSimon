import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExperencieComponent } from './experencie.component';

describe('ExperencieComponent', () => {
  let component: ExperencieComponent;
  let fixture: ComponentFixture<ExperencieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExperencieComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExperencieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

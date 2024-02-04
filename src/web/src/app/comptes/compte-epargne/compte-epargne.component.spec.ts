import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompteEpargneComponent } from './compte-epargne.component';

describe('CompteEpargneComponent', () => {
  let component: CompteEpargneComponent;
  let fixture: ComponentFixture<CompteEpargneComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CompteEpargneComponent]
    });
    fixture = TestBed.createComponent(CompteEpargneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

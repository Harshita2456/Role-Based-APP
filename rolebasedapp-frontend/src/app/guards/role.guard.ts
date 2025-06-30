import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RoleGuard implements CanActivate {

  constructor(private router: Router) {}

  canActivate(route: ActivatedRouteSnapshot): boolean {
    const expectedRole = route.data['expectedRole'];
    const storedRole = localStorage.getItem('userRole');

    if (storedRole === expectedRole) {
      return true;
    }

    this.router.navigate(['/unauthorized']);
    return false;
  }
}
import { Routes } from '@angular/router';

import { cloudflareRoute } from './';

const SPECBEE_ROUTES = [cloudflareRoute];

export const specbeeRoutes: Routes = [
    {
        path: '',
        children: SPECBEE_ROUTES
    }
];

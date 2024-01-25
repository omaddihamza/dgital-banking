export class Client{
    code: number | null = null;
    nom: string = '';
    prenom: string = '';
    dateDeNaissance: Date | null = null;
    telephone: string = '';
    identifiant: string = '';
    email: string = '';
    genre: Genre | null = null;
}

export enum Genre {
    MÂLE,
    FEMELE
}
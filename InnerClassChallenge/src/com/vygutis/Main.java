package com.vygutis;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album foje = new Album("Gyvai", "Foje");
        foje.addSong("Meiles nebus per daug", 2.36);
        foje.addSong("Paskutinis traukinys", 5.16);
        foje.addSong("Liudesys", 3.24);
        foje.addSong("Naktis", 3.23);
        foje.addSong("Diena", 4.24);
        foje.addSong("Keistai", 3.12);
        foje.addSong("Lauzo sviesa", 4.15);
        albums.add(foje);

        Album jazzu = new Album("History", "Jazzu");
        jazzu.addSong("Ka darai", 4.51);
        jazzu.addSong("Juokas", 3.41);
        jazzu.addSong("Tyla", 3.25);
        jazzu.addSong("Pasilik", 2.54);
        jazzu.addSong("Feel", 3.48);
        albums.add(jazzu);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Liudesys", playlist);
        albums.get(0).addToPlaylist("Naktis", playlist);
        albums.get(0).addToPlaylist("Rytas", playlist);
        albums.get(0).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(12, playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                case 5:
                    printList(playList);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("============================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================================");
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n1 - to play the next song\n2 - to play the previous song\n" +
                "3 - to replay the current song\n4 - delete current song\n5 - list the songs\n6 - print this menu");
    }
}

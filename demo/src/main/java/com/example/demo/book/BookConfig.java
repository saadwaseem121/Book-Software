package com.example.demo.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner bookCommandLineRunner(BookRepository repository){
        return args->
        {
            //add books by declaring their ISBN, title, author, genre, descrption,
            //publisher, year of publication, and price in that order
            Book book1 = new Book("0747532699", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy",
                        "Harry Potter and the Sorcerer's Stone is an enthralling start to\n" +
                        "  Harry's journey toward coming to terms with his past and facing his future.",
                        "Bloomsbury", 1997, 12.99);
            Book book2 = new Book("0261103342", "The Hobbit", "J.R.R. Tolkien", "High fantasy",
                    "The critically acclaimed novel that kickstarted " +
                            "the famous Middle Earth novels by J.R.R. Tolkien.",
                    "Harper Collins", 1937, 14.99);
            Book book3 = new Book("0670813028", "It", "Stephen King", "Horror",
                    "One of Stephen King's most prolific novels, starring the iconic clown character, " +
                            "Pennywise.", "Viking", 1986, 20.99);
            Book book4 = new Book("9784048677608", "Sword Art Online 1: Aincrad", "Reki Kawaraha", "Science Fiction & Fantasy", 
                                  "Sword Art Online a virtual reality game released, " +
                                  "but players quickly turns to horror as they discover that SAO is " +
                                  "a prison virtual world were game over means death.", 
                                  "Yen Press", 2014, 13.00);
            Book book5 = new Book("9781443455879", "The Midnight Library: A Novel", "Matt Haig", "Literature & Fiction.", 
                                  "Somewhere in the universe there is a library that has an infinite number of books, " +
                                  "each one the story of another reality. One tells the story of your life as it is, " +
                                  "other books had another version with a different choice at any point in your life.", 
                                  "Penguin Group", 2020, 20.40); 
            Book book6 = new Book("9780307739513", "Please Look After Mom (Vintage Contemporaries)", "Kyung-Sook Shin", "Literature & Fiction", 
                                  "When So-nyo is separated from her husband in the Seoul subway station, her family begins a desperate search for her. " +
                                  "Yet secrets and sorrows begin to reveal themselves, they are forced to wonder: " +
                                  "how well did they know the woman they called Mom?", 
                                  "Vintage", 2012, 13.99);
            Book book7 = new Book("9780099514282", "Free Food for Millionaires", "Min Jin Lee", "Literature & Fiction",  
                                  "Casey daughter of Korean immigrants is eager to make it on her own, away from her parents' tight-knit community, " + 
                                  "but she soon finds that her economics degree isn't enough to rid her of ever-growing credit card debt and a toxic boyfriend. ",
                                  "Warner Books", 2018, 17.99);
            Book book8 = new Book("9781646111497", "The Fascinating Animal Book for Kids: 500 Wild Facts! (Fascinating Facts)", "Ginjer Clarke", "Science, Nature & How It Works", 
                                  "This animal encyclopedia includes 500 amazing animal facts that offer hours of engaging learning. Alongside full-color pictures on every page",
                                  "Callisto Media", 2020, 15.99);
            Book book9 = new Book("9781626922358", " Mushoku Tensei: Jobless Reincarnation (Light Novel) Vol. 1", "Rifujin Na Magonote", " Literature & Fiction",
                                  "Kicked out by his family and wandering the streets, he hit rock-bottom--just as he’s killed by a speeding truck! " + 
                                  "Awakening to find himself reborn in another world with the memories intact, " + 
                                  "Rudeus Greyrat is determined not to repeat his past mistakes.",
                                  "Seven Seas Entertainment", 2019, 18.99);                         
            Book book10 = new Book("9781718328808", "Seirei Gensouki: Spirit Chronicles: Omnibus 1", "Yuri Kitayama", "Fiction & Fantasy", 
                                   "Rio has known nothing but solitude, hunger, and an overwhelming thirst for revenge. But from the humble beginnings of a poor orphan " +
                                   "comes a rebirth. Through his trials and tribulations, Rio’s prowess opens the door to an adventure spanning continents.",
                                   "J-Novel Club", 2021, 22.99);            
            Book book11 = new Book("9780316412896", "So I'm a Spider, So What?, Vol. 1 (light novel)", "Okina Baba", "Science Fiction & Fantasy",
                                   "I used to be a normal high school girl but in the blink of an eye, I woke up in a place I've never seen before and I was a spider?! " +
                                   "How could I possibly survive in literally the worst dungeon ever? Who the hell is responsible for this? SHOW YOUR FACE!",
                                   "Yen Press", 2017, 14.00);                               
            Book book12 = new Book("9780316312295", "My Youth Romantic Comedy Is Wrong as I Expected, Vol. 1 - light novel", "Wataru Watari", "Graphic Novels & Romance", 
                                   "Hachiman Hikigaya is a cynic. Youth is a crock, he believes--a sucker's game. But when he turns in an essay " +
                                   "for a school assignment espousing this view, he's make to work in the Service Club, " +
                                   "an organization helping students with problems in their lives!",
                                   "Yen On", 2016, 14.00);                       
            Book book13 = new Book("9780786838653", "The Lightning Thief (Percy Jackson and the Olympians, Book 1)", "Rick Riordan", "Fairy Tales, Folk Tales & Myths",
                                   "Percy Jackson's pre-algebra teacher turned into a monster and tried to kill him. " +
                                   "When Percy's mom finds out, she sends Percy to Camp Half Blood, a summer camp for " + 
                                   "demigods, where he learns that the father he never knew is Poseidon, god of the sea.",
                                   "Disney-Hyperion Books", 2006, 7.99);                                 
            Book book14 = new Book("9780141334011", "The Lost Hero (Heroes of Olympus, Book 1)", "Rick Riordan", "Fairy Tales, Folk Tales & Myths",
                                   "Jason has a problem. He doesn’t remember anything before waking up on a school bus holding hands with a girl. " +
                                   "Apparently she’s his girlfriend Piper, his best friend is a kid named Leo, and they’re all students in the Wilderness School.",
                                   "Disney-Hyperion Books", 2012, 9.99);    
            Book book15 = new Book("9781626927681", "Arifureta: From Commonplace to World's Strongest (Light Novel) Vol. 1", "Ryo Shirakome", "Ryo Shirakome",
                                   "Hajime life suddenly turned upside down when he, along with the rest of his class, is summoned to a fantasy world! " +
                                   "Hajime's job, Synergist, only has a single transmutation skill. Will he be able to survive in this dangerous world of monsters and demons?".
                                   "Seven Seas Entertainment", 2018, 23.75);
            Book book16 = new Book("9780008402648", "The Christmas Killer: (DI James Walker series) (Book 1)", "Alex Pine", "Action & Adventure", 
                                   "DI James Walker family Christmas is disturb when he opens a box on his doorstep. Inside is a promise – twelve days, twelve murders. " +
                                   "Not long after, the first body is found. Panic spreads through the remote Cumbrian village, there’s a killer amongst them.",
                                   "HarperCollins UK", 2021, 12.99);
            Book book17 = new Book("9780802716743", "Ghosts of Spain: Travels Through Spain and Its Silent Past", "Giles Tremlett", "Non-fiction & Travel Literature",
                                   "Sixty years after the Spanish Civil War, victims of Franco's death squads broke what Spaniards call 'the pact of forgetting'. " +
                                   "Giles Tremlett embarked on a journey around the country to discover why some of Europe's most voluble people have kept silent.".
                                   "Non-fiction & Travel Literature. Bloomsbury USA", 2008, 20.00);
            Book book18 = new Book("9781626927957", "Toradora! (Light Novel) Vol. 1", "Yuyuko Takemiya", "Literature & Fiction",
                                   "Takasu Ryuuji is a nice guy, but making friends when you've got an unintentionally scary face is tough. " +
                                   "Yet, Aisaka Taiga is beautiful, frightening, the girl known as the Palmtop Tiger is the one person in school even scarier than Ryuuji himself.",
                                   "Seven Seas", 2018, 13.99); 
            Book book19 = new Book("9781626921887", "Golden Time Vol. 1", "Yuyuko Takemiya", "Literature & Fiction",
                                   "College freshman Tada Banri is looking forward to a new life after losing his memories. Upon enrolling in Tokyo law school, " +
                                   "this new direction in Banri’s life stops short when he happens across a person from his past during the school’s opening ceremony.",
                                   "Seven Seas", 2015, 24.42);
            Book book20 = new Book("9781626926585", "Grimgar of Fantasy and Ash (Light Novel) Vol. 1", "Ao Jyumonji", "Literature & Fiction",
                                   "Haruhiro awakens among a group of strangers who can only remember their own names. When they make it into the light, they discover Grimgar. " +
                                   "Only by cooperating, and learning new skills can they hope to survive in this dangerous land of monsters.",
                                   "Seven Seas", 2017, 13.99);
            Book book21 = new Book("9780316339155", "Is It Wrong to Try to Pick Up Girls in a Dungeon?, Vol. 1 - light novel", "Fujino Omori", "Science Fiction & Fantasy",
                                   "Is it wrong to face the perils of Dungeon alone? Maybe. Is it wrong to dream of playing hero to maidens in Dungeon? Maybe not. " +
                                   "Bell discovers that anything can happen in the labyrinth. The only problem? He's the one who winds up the damsel in distress!",
                                   "Yen Press", 2014, 14.00);
            Book book22 = new Book("9783842025738", "The Rising of the Shield Hero Volume 1", "Aneko Yusagi", "World Literature & Fiction",
                                   "Naofumi suddenly finds himself summoned to a parallel universe! He discovers he is one of four heroes tasked with saving the world " +
                                   "from its prophesied destruction as the Shield Hero. Naofumi is soon alone, penniless, and betrayed with no one to turn to.",
                                   "One Peace Books", 2015, 12.95);
            Book book23 = new Book("9780316553377", "Konosuba: God's Blessing on This Wonderful World!, Vol. 1: Oh! My Useless Goddess!", "Natsume Akatsuki", "Science Fiction & Fantasy",
                                   "After dying Kazuma opens his eyes to see a goddess that offers him a chance to be in a parallel world. " +
                                   "The catch is that the world is violent by a growing evil! Fortunately, he can choose any one thing to bring with him. So he chooses the goddess, Aqua! ",
                                   "Yen On", 2017, 14.00);                          
            repository.saveAll(
                    List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, 
                           book14, book15, book16, book17, book18, book19, book20, book21, book22, book23)
            );
        };
    };
}

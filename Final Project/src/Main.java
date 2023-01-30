import java.util.Scanner;

public class Main
	{
		static String name;
		static String gender;
		static int strengthStat;
		static int strengthStat1;
		static int strengthStat2;
		static int strengthStat3;
		static int dexterityStat;
		static int dexterityStat1;
		static int dexterityStat2;
		static int dexterityStat3;
		static int constitutionStat;
		static int constitutionStat1;
		static int constitutionStat2;
		static int constitutionStat3;
		static int intelligenceStat;
		static int intelligenceStat1;
		static int intelligenceStat2;
		static int intelligenceStat3;
		static int wisdomStat;
		static int wisdomStat1;
		static int wisdomStat2;
		static int wisdomStat3;
		static int charismaStat;
		static int charismaStat1;
		static int charismaStat2;
		static int charismaStat3;
		
		public static void main(String[] args)
			{
				intro();
				stats();
				statsInfo();
				adventureIntro();
			}

		private static void intro()
			{
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);

				System.out.println("Welcome to Dungeons & Dragons!");
				delay();
				System.out.println("When you are ready, enter your name:");
				name = userStringInput.nextLine();
				System.out.println("Hey " + name + ". Welcome.");
				delay();
				System.out.println("Are you a male or a female:");
				gender = userStringInput.nextLine();
				System.out.println("Cool Beans!");
			}
		
		private static void stats()
			{	
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				
				boolean game = true;
				int count = 1;
				
// Strength
				System.out.println("It is time to roll 3 d6 die for stats. Press (1) to roll for Strength");
				
				int roll = userIntInput.nextInt();
				strengthStat = 0;
				if (roll == 1)
					{
						strengthStat1 = (int) (Math.random() * 6) + 1;
					}
					{
						strengthStat2 = (int) (Math.random() * 6) + 1;
					}
					{
						strengthStat3 = (int) (Math.random() * 6) + 1;
					}
					strengthStat = strengthStat1 + strengthStat2 + strengthStat3;
					delay();
					System.out.println("First roll:");
					System.out.println(strengthStat1);
					delay();
					System.out.println("Second roll:");
					System.out.println(strengthStat2);
					delay();
					System.out.println("Third roll:");
					System.out.println(strengthStat3);
					delay();
					System.out.println("Your Strength stat is " + strengthStat);
				
// Dexterity
				System.out.println("It is time to roll 3 d6 die for stats. Press (1) to roll for Dexterity");
				
				int roll2 = userIntInput.nextInt();
				dexterityStat = 0;
				if (roll2 == 1)
					{
						dexterityStat1 = (int) (Math.random() * 6) + 1;
					}
					{
						dexterityStat2 = (int) (Math.random() * 6) + 1;
					}
					{
						dexterityStat3 = (int) (Math.random() * 6) + 1;
					}
					dexterityStat = dexterityStat1 + dexterityStat2 + dexterityStat3;
					delay();
					System.out.println("First roll:");
					System.out.println(dexterityStat1);
					delay();
					System.out.println("Second roll:");
					System.out.println(dexterityStat2);
					delay();
					System.out.println("Third roll:");
					System.out.println(dexterityStat3);
					delay();
					System.out.println("Your Dexterity stat is " + dexterityStat);
				
// Constitution
				System.out.println("It is time to roll 3 d6 die for stats. Press (1) to roll for Constitution");
				
				int roll3 = userIntInput.nextInt();
				constitutionStat = 0;
				if (roll3 == 1)
					{
						constitutionStat1 = (int) (Math.random() * 6) + 1;
					}
					{
						constitutionStat2 = (int) (Math.random() * 6) + 1;
					}
					{
						constitutionStat3 = (int) (Math.random() * 6) + 1;
					}
					constitutionStat = constitutionStat1 + constitutionStat2 + constitutionStat3;
					delay();
					System.out.println("First roll:");
					System.out.println(constitutionStat1);
					delay();
					System.out.println("Second roll:");
					System.out.println(constitutionStat2);
					delay();
					System.out.println("Third roll:");
					System.out.println(constitutionStat3);
					delay();
					System.out.println("Your Constitution stat is " + constitutionStat);
				
// Intelligence
				System.out.println("It is time to roll 3 d6 die for stats. Press (1) to roll for Intelligence");
				
				int roll4 = userIntInput.nextInt();
				intelligenceStat = 0;
				if (roll4 == 1)
					{
						intelligenceStat1 = (int) (Math.random() * 6) + 1;
					}
					{
						intelligenceStat2 = (int) (Math.random() * 6) + 1;
					}
					{
						intelligenceStat3 = (int) (Math.random() * 6) + 1;
					}
					intelligenceStat = intelligenceStat1 + intelligenceStat2 + intelligenceStat3;
					delay();
					System.out.println("First roll:");
					System.out.println(intelligenceStat1);
					delay();
					System.out.println("Second roll:");
					System.out.println(intelligenceStat2);
					delay();
					System.out.println("Third roll:");
					System.out.println(intelligenceStat3);
					delay();
					System.out.println("Your Intelligence stat is " + intelligenceStat);
					
// Wisdom
				System.out.println("It is time to roll 3 d6 die for stats. Press (1) to roll for Wisdom");
				
				int roll5 = userIntInput.nextInt();
				wisdomStat = 0;
				if (roll5 == 1)
					{
						wisdomStat1 = (int) (Math.random() * 6) + 1;
					}
					{
						wisdomStat2 = (int) (Math.random() * 6) + 1;
					}
					{
						wisdomStat3 = (int) (Math.random() * 6) + 1;
					}
					wisdomStat = wisdomStat1 + wisdomStat2 + wisdomStat3;
					delay();
					System.out.println("First roll:");
					System.out.println(wisdomStat1);
					delay();
					System.out.println("Second roll:");
					System.out.println(wisdomStat2);
					delay();
					System.out.println("Third roll:");
					System.out.println(wisdomStat3);
					delay();
					System.out.println("Your Wisdom stat is " + wisdomStat);
				
// Charisma
				System.out.println("It is time to roll a dice for stats. Press (1) to roll for Charisma");
				
				int roll6 = userIntInput.nextInt();
				charismaStat = 0;
				if (roll6 == 1)
					{
						charismaStat1 = (int) (Math.random() * 6) + 1;
					}
					{
						charismaStat2 = (int) (Math.random() * 6) + 1;
					}
					{
						charismaStat3 = (int) (Math.random() * 6) + 1;
					}
					charismaStat = charismaStat1 + charismaStat2 + charismaStat3;
					delay();
					System.out.println("First roll:");
					System.out.println(charismaStat1);
					delay();
					System.out.println("Second roll:");
					System.out.println(charismaStat2);
					delay();
					System.out.println("Third roll:");
					System.out.println(charismaStat3);
					delay();
					System.out.println("Your Charisma stat is " + charismaStat);
			}
		private static void delay()
		{
			try
				{
					Thread.sleep(750);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
		}
		private static void statsInfo()
			{
				System.out.println("     ");
				System.out.println("     ");
				System.out.println("     ");
				
				System.out.println("Name: " + name );
				System.out.println("Gender: " + gender );
				System.out.println("     ");
				System.out.println("Stats: ");
				System.out.println("---------");
				System.out.println("Strength: " + strengthStat);
				System.out.println("Dexterity: " + dexterityStat);
				System.out.println("Constitution: " + constitutionStat);
				System.out.println("Intelligence: " + intelligenceStat);
				System.out.println("Wisdom: " + wisdomStat);
				System.out.println("Charisma: " + charismaStat);
				
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("Into the Story!");
				System.out.println("   |   ");
				System.out.println("   |   ");
				System.out.println("   |   ");
				System.out.println("   V   ");
			}
		
		private static void adventureIntro()
			{
				delay();
				System.out.println("Hey " + name + ", wake up! You hear someone yelling to you from far away. \nUpon waking up, you notice a huge city full of all kinds of people. \nHumans, giants, dragons and tons more! \nYou are confused at where you are.");
				delay();
				System.out.println("Do you (1) go ask someone where you are or (2) wander around and try to remember?");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int choice = userIntInput.nextInt();
				
				if(choice == 1)
					{
						delay();
						System.out.println("You walk up to a seller at a market and ask where you are. \nIt is a half horse and half man to which you are suprised by. \nHe tells you that you are in the second largest city, Fubberio in the land of EnchyVille. \nHe also tells you that if you cry in this world, you will die.");
						oneAdventure();
					}
				if(choice == 2)
					{
						delay();
						System.out.println("You wander around for a little bit taking in the beautiful land. \nYou are still confused, but something in the back of your mind tells you not to worry. \nYou head back to where you started and check what you have.");
						oneAdventure();
					}
				else
					{
						delay();
						adventureIntro();
					}	
			}
		
		private static void oneAdventure()
			{
				delay();
				System.out.println("You look in your drawstring bag and see you have 23 silver coins with a strange head on them. \nYou also have a small dagger and some string");
				delay();
				System.out.println("At this point it is getting dark. \nYou forget all about the time and decide it is time to find somewhere to stay. \nYou can either (1) look for an inn or (2) find a tree or alley to sleep in.");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				
				int choice1 = userIntInput.nextInt();
				if(choice1 == 1)
					{
						delay();
						System.out.println("You find a cozy inn, but they do not accept your form of currency. \nYou ask what you can use them on, but the owner has never seen coins like it before. \nYou set back outside to go to sleep.");
						dayOne();
					}
				if(choice1 == 2)
					{
						delay();
						System.out.println("You find a large willow tree that looks like it would be safe.");
						dayOne();
					}
				else
					{
						delay();
						oneAdventure();
					}
				
			}

		private static void dayOne()
			{
				delay();
				System.out.println("You walk over set your limited items down, and set off to sleep.");
				delay();
				System.out.println("You wake up from a long nights rest. \nYou open your bag and find that, suprisingly, nothing has been stolen. \nYesterday you saw a quest posted outside of a bar. \nYou go back to see what it is and you ask the bartender about it. \nHe tells you if you kill 1 goblin, you can get 5 gold coins.");
				delay();
				System.out.println("You decide to accept the quest and get on with your adventure. \nYou can go try checking the (1) Forest or (2) the Mines.");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int choice2 = userIntInput.nextInt();
				
				if(choice2 == 1)
					{
						delay();
						System.out.println("The bartender gave you a map so you check where the forest is. \nYou depart to the Forest of Sychist.");
						goForest();
					}
				if(choice2 == 2)
					{
						delay();
						System.out.println("'The mines seemms like where goblins would be' you say to yourself. \nWalking off, dagger in hands, to the Mines of Fake Immortality, you have lots of adrenaline! \nAfter a long walk, you arrive at the mines! \nYou can't believe how beautiful it is as you walk in.");
						goMines();
					}
				else
					{
						delay();
						dayOne();
					}
			}

		private static void goForest()
			{
				delay();
				System.out.println("The forest is suprisingly light, but it looks like you could get lost easily. \nThere is an open path that you walk down. \nYou pass quite a few people, but less and less as you move on. \nYou come to a clearing of hills where you see a group of goblins running into the forest. \nDo you (1) chase after them, (2) stay on the path, or (3) turn around?");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int forestChoice= userIntInput.nextInt();
				
				if(forestChoice == 1)
					{
						delay();
						System.out.println(" ");
						goblinChase();
					}
				if(forestChoice == 2)
					{
						delay();
						System.out.println(" ");
						pathFollow();
					}
				if(forestChoice == 3)
					{
						delay();
						System.out.println(" ");
						turnAround();
					}
				else
					{
						delay();
						goForest();
					}
				
			}
		
		private static void turnAround()
			{
				delay();
				System.out.println("Do you want to (1) go to the mines or (2) stay here?");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int aroundTurn= userIntInput.nextInt();
				
				if(aroundTurn == 1)
					{
						delay();
						goMines();
					}
				if(aroundTurn == 2)
					{
						delay();
						goForest();
					}
				else
					{
						delay();
						turnAround();
					}
			}

		private static void pathFollow()
			{
				delay();
				System.out.println("You keep to the path. \nAs you go through another patch of trees, you see a waterfall. \nYou can either (1) turn back to the fields or (2) see if their is something behind the waterfall.");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int waterfallChoice= userIntInput.nextInt();
				
				
				if(waterfallChoice == 1)
					{
						delay();
						fieldLocation();
					}
				if(waterfallChoice == 2)
					{
						delay();
						waterfallBehind();
					}
				else
					{
						delay();
						pathFollow();
					}
			}

		private static void fieldLocation()
			{
				delay();
				System.out.println("You are back at the fields and you still know where the goblins went. \nYou can either (1) chase after the goblins or (2) turn back to the mines");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int randomPick= userIntInput.nextInt();
				
				if(randomPick == 1)
					{
						delay();
						goblinChase();
					}
				if(randomPick == 2)
					{
						delay();
						goMines();
					}
				else
					{
						delay();
						fieldLocation();
					}
			}

		private static void waterfallBehind()
			{
				delay();
				System.out.println("You walk up and try to walk behind the waterfall, but there is nothing because this is not a movie. \nYou can (1) go back to the fields or (2) sit here and ponder your dumb mistake. ");
			
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int waterfallThang= userIntInput.nextInt();
				
				if(waterfallThang == 1)
					{
						delay();
						System.out.println("You head back to the fields:");
						fieldLocation();
					}
				if(waterfallThang == 2)
					{
						delay();
						System.out.println("You sit on the ground and think about how much of a dumb idea it was to check behind the waterfall. \nYou get up to go back to the fields feeling ashamed.");
						fieldLocation();
					}
				else
					{
						delay();
						waterfallBehind();
					}
			}

		private static void goblinChase()
			{
				delay();
				System.out.println("You decide to chase after the goblins. \nYou see them up in a camp in front of you. \nYou can either (1) set up a trap for 2 that are isolated or (2) try to fight them head on.");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int chaseChoice3= userIntInput.nextInt();
				
				if (chaseChoice3 == 1)
					{
						delay();
						System.out.println("You decide to set up a trap.");
						trapSet();
					}
				if (chaseChoice3 == 1)
					{
						delay();
						System.out.println("As you run up, you notice there are more hiding in the trees, waiting to ambush you. \nYou cannot fight them all. \nThe goblins capture you and kill you.");
						theEnd();
					}
				else
					{
						delay();
						goblinChase();
					}
				
			}

		private static void trapSet()
			{
				delay();
				System.out.println("You can set up the trap quickly and quietly. \nYou put the string on one end of the tree and your dagger on the other. \nYou drop the coins at the bottom as bait. \nTwo goblins see it after 5 minutes and start to run over. \nYou get lucky and kill 2 with only 1 more left. You can (1) attack the last one or (2) head back to Fubberio and turn in your quest:");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int trapChoice= userIntInput.nextInt();
				
				if(trapChoice == 1)
					{
						delay();
						System.out.println("You decide to fight the last goblin because you feel confident:");
						fightGoblin();
					}
				if(trapChoice == 2)
					{
						delay();
						System.out.println("You know you only needed to get 1, so you decide to head back and turn in the quest.");
						goodEnd();
					}
				else {
					delay();
					trapSet();
				}
			}

		private static void goMines()
			{
				delay();
				System.out.println("You here loud noises coming from down the tunnels, assuming it is people mining. \nThere are two tunnels: (1) left and (2) right. \nThere is complete silence from the left, and mining sounds from the right.");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				
				int mineChoice1 = userIntInput.nextInt();
				
				if(mineChoice1 == 1)
					{
						delay();
						System.out.println("You decide silence is better. \nGoing left, you move quickly down the underpass. ");
						leftMine();
					}
				if(mineChoice1 == 2)
					{
						delay();
						System.out.println("The noises attract you towards the right side. \nAs you walk slowly down the corridor, the noises seem to get farther away. \nYou can (1) keep going down the tunnel, (2) turn around, or (3) cry: ");
						rightMine();
					}
				else
					{
						delay();
						goMines();
					}
			}

		private static void rightMine()
			{
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int mineChoice2 = userIntInput.nextInt();
				
				if(mineChoice2 == 1)
					{
						delay();
						System.out.println("All the noises come to a complete stop. \nYou see a door that seems to be locked, but you could push it open if your strength was about 8.");
						if(strengthStat < 9)
							{			
								delay();
								System.out.println("The door will not budge so you have to turn around.");
								goMines();
							}
						if(strengthStat == 9)
							{
								delay();
								System.out.println("With your strength you push the door open!");
								mysteryDoor();
							}
						if(strengthStat > 9)
							{
								delay();
								System.out.println("With your strength you push the door open!");
								mysteryDoor();
							}
					}
				if(mineChoice2 == 2)
					{
						delay();
						System.out.println("You decide to head back out of fear of being lost.");
						goMines();
					}
				if(mineChoice2 == 3)
					{
						delay();
						System.out.println("You cry so much, you simply pass away!");
						theEnd();
					}
				else
					{
						delay();
						rightMine();
					}
			}

		private static void leftMine()
			{
				delay();
				System.out.println("You start heading down the left side of the mine. \nAs the dead silence continues, a light starts to appear down the corridor. \nBreaking into a sprint, the light gets closer and closer. \nYou rub your eyes to udjust to the light and see a large crystal cavern. \nThere is a goblin camp at the bottom, but you are clearly outnumbered. \nThere is one miner that is off to the side, alone. \nIf you rolled over a 10 on a d20, you could attack him alone, and not atract the others. \nDo you want to try to (1) attack the miner solo or (2) turn back?");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int leftChoice = userIntInput.nextInt();
				
				if(leftChoice == 1)
					{
						delay();
						System.out.println("You decide to try and attack the goblin that is alone.");
						int diceRollOne=0;
						diceRollOne = (int) (Math.random() * 20) + 1;

							int roll= diceRollOne;
							
							System.out.println("You rolled a " + roll);
							
							if(roll < 10)
								{
									delay();
									System.out.println("You get noticed trying to attack the goblin. \nYou are then captured, tortured, and killed.");
									theEnd();
								}
							if(roll > 10)
								{
									delay();
									System.out.println("You start run at the goblin. \n");
								}
							if(roll == 10)
								{
									delay();
									System.out.println("You get noticed trying to attack the goblin. \nYou are then captured, tortured, and killed.");
									theEnd();
								}
					}
				if(leftChoice == 2) 
						{
						secondLeft();
						}
				else
					{
						goMines();
					}
					}

		private static void secondLeft()
			{
				delay();
				System.out.println("You start to turn back. \nYou can either (1) go to mine entrance or (2) go to the forest.");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				
				int leftChoice2 = userIntInput.nextInt();
				
					if(leftChoice2 == 1)
						{
							delay();
							System.out.println("You turn back to the entrance of the mine.");
							goMines();
						}
					if(leftChoice2 == 2) 
						{
							delay();
							System.out.println("You go to the forest.");
							goForest();
						}
					else
						{
							delay();
							leftMine();
						}
			}

		private static void mysteryDoor()
			{
				delay();
				System.out.println("With the door shoved aside, you can see a bright light gleaming from the other side. \nThere is a stream of water with something next to it. \nYou squint in and see its a goblin that you were looking for! \nYou pull out your dagger and start to sneak up.");
				if(dexterityStat < 13)
					{
						delay();
						System.out.println("You stumble on the way crouching to take out the naive goblin. \nHe then turns around and pulls out a shortsword. \nYou were not prepared for a fight, but its the only option now.");
						fightGoblin();
					}
				if(dexterityStat > 13)
					{
						delay();
						System.out.println("You backstab the goblin and it stops moving instantly. \nYou killed it! You hear '" + name + "'. Someone is calling for you. \nThere is a spiral of particles around you, and suddenly you are teleported back to the questmaster.");
						goodEnd();
					}
				if(dexterityStat == 13)
					{
						delay();
						System.out.println("You backstab the goblin and it stops moving instantly. \nYou killed it! You hear '" + name + "'. Someone is calling for you. \nThere is a spiral of particles around you, and suddenly you are teleported back to the questmaster.");
						goodEnd();
					}
			}

		private static void fightGoblin()
			{
				delay();
				System.out.println("You can either (1) attack, (2) defend, or (3) flee");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int fightChoice= userIntInput.nextInt();
				
				if(fightChoice == 1)
					{
						delay();
						System.out.println("You choose to attack:");
						attackGoblin();
					}
				if(fightChoice == 2)
					{
						delay();
						System.out.println("You decide to defend: \nThe goblin attacks but you block it. What is your next move?");
						fightGoblin();
					}
				if(fightChoice == 3)
					{
						delay();
						System.out.println("You can't get away!");
						fightGoblin();
					}
				else {
					delay();
					fightGoblin();
				}
			}
		
		private static void attackGoblin()
			{
				delay();
				System.out.println("You can swing at the (1) head or (2) stomach");
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int swingMove= userIntInput.nextInt();
			
				if(swingMove == 1)
					{
						delay();
					System.out.println("You swing at the head, but miss by a longshot. \nWhat do you want to do now?");
					fightGoblin();
					}
				if(swingMove == 2)
					{
						delay();
					System.out.println("You swing at the stomach and it lands a direct hit! \nYou instantly kill the goblin and are happy to know it wasn't too hard.");
					goodEnd();
					}
				else
					{
						delay();
						attackGoblin();
					}
			}

		private static void goodEnd()
			{
				delay();
				System.out.println(name + " heads back to the capital of Fubberio and head to the tavern you go the quest from. \nYou turn in the head of a goblin as proof and he gives you coins. \nYou can't wait until you can go on more quests!");
			}

		private static void theEnd()
			{
				delay();
				System.out.println("Welp " + name + " died. Its kinda over now :( ");
			}

	}

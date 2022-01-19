import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.Console;

public class initializeVariables {
    static String globText[][] = 
		{
			{
				"WAIT",
				"Seven boys and seven girls, lined up under the hazy sun.\n\nWeaponless, defenseless. Which death for these youth would be worse; devoured by a half-man beast, or starved in a lightless corner?\n\nThe threads of fate were to run bare today, is what the others presumed. But you have a plan. The bloody tributes have continued for too long.\n\nA fool's plan, not untried before; yet even the bravest of warriors had failed. Will you be the one to complete it?\n\nYour tunic is heavy, the sheathed sword underneath warming uncomfortably in the heat. You shift it a bit to prevent the guards from noticing.\n\nThis beast, this supposed monster with a bull's head, how will it act? Will it be possible to speak reason with it? It is, after all, half man. You reprimand yourself with a pinch; be more concerned about how to survive the journey first.", "And so it begins. The guards shove you forward. You shove yourself forward before your temper can strike out. Remember, weaponless, defenseless, a sacrifice to something higher. Sacrifices do not fight back.\n\nAlone, you are escorted to an entrance. You wonder if you will see the boy who was beside you again.\n\nThe iron doors groan, then scream, then snap shut decisively. You are alone now, but you must continue. How is it that the chill of the dark air can freeze your skin such that the faint warmth of the weak torch feels like a bonfire?\n\nThe walls seem to perspire, as if they share your fears. Regret is a friend who is too far away. If nothing else smolders your determination, terror will.",
				"After a bend, you arrive at your first challenge.\n\nTo the right, a branch in the caverns: the sputtering torch in your hands does nothing but amplify the shadows of the opening. The air feels damper, somehow, when you step inside.\n\nThe torch's halo dims, and you cling to the walls. One misstep could lead to a plummeting fall, or even just a sprain. You need to be very, very careful from now on, including in your decisions.",
				"Which path do you take?\n\tContinue straight (enter 1)\n\tTurn right (enter 2)\n"
			},
			{
				"END",
				"You continue forward. It’d be best to not take too many risks, right?\n\nWrong.\n\nYour foot catches a wire, and you tumble over the hidden trap. It creaks and groans, and you scramble to your feet. Something’s gone wrong. Gears shift around and scream. You bolt back the direction you came from, but the slippery ground doesn’t allow for it.\n\nSomething cold and heavy lands on your neck. There’s a crack before your body is left behind in this depressing mortal plane.",
				"THE END"
			},
			{
				"WAIT",
				"Careful, careful. Tiny treads forward. A tap on the ground before a step. Reach forward to shed some light. The mantra rings in your head.\n\nYour strategy proves useful when your toe sweeps air instead of stone. It shakes your balance only slightly, and you grip onto a prickly, damp wooden railing. Your torch reveals a gap in your path; a narrow river, deep and violent, bashing against the walls it carved like a bull.\n\nThere is a bridge, but years have rotted the planks and frayed the ropes. Some pieces still appear salvageable though, and a bit of handiwork should be able to sustain your crossing.\n\nFrom your hand, the rope fastens into a series of knots, the dangling pieces linking to form a makeshift tightrope. Of course, you won’t be able to walk across it, but you can crawl.\n\nYou toss your belongings over. This rope might not be able to hold an adult person and a metal sword.\n\nClinging to the cord, you shift across. The splashing and crashing of the river below tries to unsettle you. It sounds like a bull too. You can’t be frightened by this. What would you do when you face the real bull?\n\nThe last fragment of rope is a bit thinner, chewed away by mold and water. So close to the other side, you grip the last section, then haul yourself onto solid land.\n\nThe rope snaps once your weight shifts. You manage to pull yourself onto the other side. The snake sways and lashes against the rocks, furious at your betrayal. You are a little sad yourself; that rope would’ve been quite useful.\n\nAlas, the journey continues.",
				"You can almost feel the trajectory of the sun as you’re stuck in what feels like an endless series of stairs and corridors. The sound of your footsteps becomes unbearable. The darkness hugs closer as your torch fades.\n\nIt feels like winter by the time you reach another crossroads, quite literally. You stumble into the wall in front of you and sink to the floor, too tired and cold to make a decision. You set your torch aside and rub your hands, as if you could start a fire with them.\n\nThere are two doors this time. You press your palm to the rotting wood of the left. It’s vibrating; perhaps something alive is behind it. If it’s an animal, it could mean food. The right door is bronze, heavy to open; it’s warm to the touch, and you’re almost tempted to fling it open right then and there.",
				"Knowing the genius of the designer, you likely won’t be able to turn back. Which door do you open?\n\n The bronze door (enter 3)\n\nb) The wooden door (enter 4)"
			}
		};
	static boolean globAdj[][] = 
		{
			{false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		};
}

package pathfinding;

import java.util.ArrayList;

import org.lwjgl.util.vector.Vector3f;

public class Grid {
	
	private ArrayList<Node> nodes;
	
	public Grid(){
		nodes = new ArrayList<Node>();
		nodes.add(new Node(new Vector3f(5.19827f, 12.207812f, -34.726833f), new Vector3f(4.151061f, 12.207812f, -52.76936f)));
		nodes.add(new Node(new Vector3f(4.151061f, 12.207812f, -52.76936f), new Vector3f(5.19827f, 12.207812f, -34.726833f), new Vector3f(-136.14388f, 12.207812f, -49.87002f), new Vector3f(77.41691f, 12.207812f, -50.254097f)));
		nodes.add(new Node(new Vector3f(-136.14388f, 12.207812f, -49.87002f), new Vector3f(4.151061f, 12.207812f, -52.76936f), new Vector3f(-137.08928f, 12.207812f, -24.35993f)));
		nodes.add(new Node(new Vector3f(77.41691f, 12.207812f, -50.254097f), new Vector3f(4.151061f, 12.207812f, -52.76936f), new Vector3f(133.50655f, 12.207812f, -50.721485f), new Vector3f(77.42979f, 12.207812f, -34.388428f)));
		nodes.add(new Node(new Vector3f(77.42979f, 12.207812f, -34.388428f), new Vector3f(77.41691f, 12.207812f, -50.254097f)));
		nodes.add(new Node(new Vector3f(-137.08928f, 12.207812f, -24.35993f), new Vector3f(-136.14388f, 12.207812f, -49.87002f), new Vector3f(-129.63837f, 12.207812f, -25.888731f), new Vector3f(-137.92659f, 12.207812f, 39.69316f)));
		nodes.add(new Node(new Vector3f(-129.63837f, 12.207812f, -25.888731f), new Vector3f(-137.08928f, 12.207812f, -24.35993f)));
		nodes.add(new Node(new Vector3f(-137.92659f, 12.207812f, 39.69316f), new Vector3f(-137.08928f, 12.207812f, -24.35993f), new Vector3f(-137.36604f, 12.207812f, 82.38872f), new Vector3f(131.17212f, 12.207812f, 40.1478f)));
		nodes.add(new Node(new Vector3f(-137.36604f, 12.207812f, 82.38872f), new Vector3f(-137.92659f, 12.207812f, 39.69316f), new Vector3f(-91.451584f, 12.207812f, 82.1519f)));
		nodes.add(new Node(new Vector3f(-91.451584f, 12.207812f, 82.1519f), new Vector3f(-137.36604f, 12.207812f, 82.38872f), new Vector3f(-91.843285f, 12.207812f, 107.819275f), new Vector3f(5.041502f, 12.207812f, 82.09144f)));
		nodes.add(new Node(new Vector3f(-91.843285f, 12.207812f, 107.819275f), new Vector3f(-91.451584f, 12.207812f, 82.1519f)));
		nodes.add(new Node(new Vector3f(5.041502f, 12.207812f, 82.09144f), new Vector3f(-91.451584f, 12.207812f, 82.1519f), new Vector3f(5.013365f, 12.207812f, 107.1021f), new Vector3f(77.99904f, 12.207812f, 82.88899f)));
		nodes.add(new Node(new Vector3f(5.013365f, 12.207812f, 107.1021f), new Vector3f(5.041502f, 12.207812f, 82.09144f)));
		nodes.add(new Node(new Vector3f(77.99904f, 12.207812f, 82.88899f), new Vector3f(5.041502f, 12.207812f, 82.09144f), new Vector3f(77.78197f, 12.207812f, 107.18101f), new Vector3f(133.15561f, 12.207812f, 82.39169f)));
		nodes.add(new Node(new Vector3f(77.78197f, 12.207812f, 107.18101f), new Vector3f(77.99904f, 12.207812f, 82.88899f), new Vector3f(76.98433f, 12.207812f, 143.74986f)));
		nodes.add(new Node(new Vector3f(76.98433f, 12.207812f, 143.74986f), new Vector3f(77.78197f, 12.207812f, 107.18101f), new Vector3f(106.10995f, 12.207812f, 143.59534f)));
		nodes.add(new Node(new Vector3f(106.10995f, 12.207812f, 143.59534f), new Vector3f(76.98433f, 12.207812f, 143.74986f), new Vector3f(109.68505f, 12.207812f, 118.22202f)));
		nodes.add(new Node(new Vector3f(109.68505f, 12.207812f, 118.22202f), new Vector3f(106.10995f, 12.207812f, 143.59534f), new Vector3f(134.59743f, 12.207812f, 118.56562f)));
		nodes.add(new Node(new Vector3f(134.59743f, 12.207812f, 118.56562f), new Vector3f(109.68505f, 12.207812f, 118.22202f), new Vector3f(134.43683f, 12.207812f, 151.5894f)));
		nodes.add(new Node(new Vector3f(134.43683f, 12.207812f, 151.5894f), new Vector3f(134.59743f, 12.207812f, 118.56562f)));
		nodes.add(new Node(new Vector3f(133.15561f, 12.207812f, 82.39169f), new Vector3f(77.99904f, 12.207812f, 82.88899f), new Vector3f(131.17212f, 12.207812f, 40.1478f)));
		nodes.add(new Node(new Vector3f(131.17212f, 12.207812f, 40.1478f), new Vector3f(133.15561f, 12.207812f, 82.39169f), new Vector3f(-137.92659f, 12.207812f, 39.69316f), new Vector3f(133.50655f, 12.207812f, -50.721485f)));
		nodes.add(new Node(new Vector3f(133.50655f, 12.207812f, -50.721485f), new Vector3f(131.17212f, 12.207812f, 40.1478f), new Vector3f(77.41691f, 12.207812f, -50.254097f), new Vector3f(132.75136f, 12.207812f, -72.71853f)));
		nodes.add(new Node(new Vector3f(132.75136f, 12.207812f, -72.71853f), new Vector3f(133.50655f, 12.207812f, -50.721485f), new Vector3f(53.436317f, 12.207812f, -72.48219f), new Vector3f(131.6367f, 12.207812f, -97.71996f)));
		nodes.add(new Node(new Vector3f(53.436317f, 12.207812f, -72.48219f), new Vector3f(132.75136f, 12.207812f, -72.71853f), new Vector3f(49.936264f, 12.207812f, -98.46633f), new Vector3f(-140.76079f, 12.207812f, -73.2765f)));
		nodes.add(new Node(new Vector3f(-140.76079f, 12.207812f, -73.2765f), new Vector3f(53.436317f, 12.207812f, -72.48219f), new Vector3f(-141.20857f, 12.207812f, -99.361305f)));
		nodes.add(new Node(new Vector3f(-141.20857f, 12.207812f, -99.361305f), new Vector3f(-140.76079f, 12.207812f, -73.2765f), new Vector3f(-140.95941f, 12.207812f, -125.08106f), new Vector3f(49.936264f, 12.207812f, -98.46633f)));
		nodes.add(new Node(new Vector3f(-140.95941f, 12.207812f, -125.08106f), new Vector3f(-141.20857f, 12.207812f, -99.361305f), new Vector3f(51.615383f, 12.207812f, -125.00181f)));
		nodes.add(new Node(new Vector3f(49.936264f, 12.207812f, -98.46633f), new Vector3f(53.436317f, 12.207812f, -72.48219f), new Vector3f(-141.20857f, 12.207812f, -99.361305f), new Vector3f(51.615383f, 12.207812f, -125.00181f), new Vector3f(131.6367f, 12.207812f, -97.71996f)));
		nodes.add(new Node(new Vector3f(131.6367f, 12.207812f, -97.71996f), new Vector3f(49.936264f, 12.207812f, -98.46633f), new Vector3f(132.75136f, 12.207812f, -72.71853f), new Vector3f(131.18355f, 12.207812f, -126.06995f)));
		nodes.add(new Node(new Vector3f(51.615383f, 12.207812f, -125.00181f), new Vector3f(-140.95941f, 12.207812f, -125.08106f), new Vector3f(49.936264f, 12.207812f, -98.46633f), new Vector3f(131.18355f, 12.207812f, -126.06995f)));
		nodes.add(new Node(new Vector3f(131.18355f, 12.207812f, -126.06995f), new Vector3f(51.615383f, 12.207812f, -125.00181f), new Vector3f(131.6367f, 12.207812f, -97.71996f)));
		/* 5.19827f, 12.207812f, -34.726833 -- 4.151061f, 12.207812f, -52.76936//
		 * 
		 * 4.151061f, 12.207812f, -52.76936 -- 5.19827f, 12.207812f, -34.726833 -- -136.14388f, 12.207812f, -49.87002 -- 77.41691f, 12.207812f, -50.254097//
		 * 
		 * -136.14388f, 12.207812f, -49.87002 -- 4.151061f, 12.207812f, -52.76936 -- -137.08928f, 12.207812f, -24.35993//
		 * 
		 * 77.41691f, 12.207812f, -50.254097 -- 4.151061f, 12.207812f, -52.76936 -- 133.50655f, 12.207812f, -50.721485 -- 77.42979f, 12.207812f, -34.388428//
		 * 
		 * 77.42979f, 12.207812f, -34.388428 -- 77.41691f, 12.207812f, -50.254097//
		 * 
		 * -137.08928f, 12.207812f, -24.35993 -- -136.14388f, 12.207812f, -49.87002 -- -129.63837f, 12.207812f, -25.888731 -- -137.92659f, 12.207812f, 39.69316//
		 * 
		 * -129.63837f, 12.207812f, -25.888731 -- -137.08928f, 12.207812f, -24.35993//
		 * 
		 * -137.92659f, 12.207812f, 39.69316 -- -137.08928f, 12.207812f, -24.35993 -- -137.36604f, 12.207812f, 82.38872 -- 131.17212f, 12.207812f, 40.1478//
		 * 
		 * -137.36604f, 12.207812f, 82.38872 -- -137.92659f, 12.207812f, 39.69316 -- -91.451584f, 12.207812f, 82.1519//
		 * 
		 * -91.451584f, 12.207812f, 82.1519 -- -137.36604f, 12.207812f, 82.38872 -- -91.843285f, 12.207812f, 107.819275 -- 5.041502f, 12.207812f, 82.09144//
		 * 
		 * -91.843285f, 12.207812f, 107.819275 -- -91.451584f, 12.207812f, 82.1519//
		 * 
		 * 5.041502f, 12.207812f, 82.09144 -- -91.451584f, 12.207812f, 82.1519 -- 5.013365f, 12.207812f, 107.1021 -- 77.99904f, 12.207812f, 82.88899//
		 * 
		 * 5.013365f, 12.207812f, 107.1021 -- 5.041502f, 12.207812f, 82.09144//
		 *asdf
		 * 77.99904f, 12.207812f, 82.88899 -- 5.041502f, 12.207812f, 82.09144 -- 77.78197f, 12.207812f, 107.18101 -- 133.15561f, 12.207812f, 82.39169//
		 * 
		 * 77.78197f, 12.207812f, 107.18101 -- 77.99904f, 12.207812f, 82.88899 -- 76.98433f, 12.207812f, 143.74986//
		 * 
		 * 76.98433f, 12.207812f, 143.74986 -- 77.78197f, 12.207812f, 107.18101 -- 106.10995f, 12.207812f, 143.59534//
		 * 
		 * 106.10995f, 12.207812f, 143.59534 -- 76.98433f, 12.207812f, 143.74986 -- 109.68505f, 12.207812f, 118.22202//
		 * 
		 * 109.68505f, 12.207812f, 118.22202 -- 106.10995f, 12.207812f, 143.59534 -- 134.59743f, 12.207812f, 118.56562//
		 * 
		 * 134.59743f, 12.207812f, 118.56562 -- 109.68505f, 12.207812f, 118.22202 -- 134.43683f, 12.207812f, 151.5894//
		 * 
		 * 134.43683f, 12.207812f, 151.5894 -- 134.59743f, 12.207812f, 118.56562//
		 * 
		 * 133.15561f, 12.207812f, 82.39169 -- 77.99904f, 12.207812f, 82.88899 -- 131.17212f, 12.207812f, 40.1478//
		 * 
		 * 131.17212f, 12.207812f, 40.1478 -- 133.15561f, 12.207812f, 82.39169 -- -137.92659f, 12.207812f, 39.69316 -- 133.50655f, 12.207812f, -50.721485//
		 * 
		 * 133.50655f, 12.207812f, -50.721485 -- 131.17212f, 12.207812f, 40.1478 -- 77.41691f, 12.207812f, -50.254097 -- 132.75136f, 12.207812f, -72.71853//
		 * 
		 * 132.75136f, 12.207812f, -72.71853 -- 133.50655f, 12.207812f, -50.721485 -- 53.436317f, 12.207812f, -72.48219 -- 131.6367f, 12.207812f, -97.71996//
		 * asdf
		 * 53.436317f, 12.207812f, -72.48219 -- 132.75136f, 12.207812f, -72.71853 -- 49.936264f, 12.207812f, -98.46633 -- -140.76079f, 12.207812f, -73.2765//
		 * 
		 * -140.76079f, 12.207812f, -73.2765 -- 53.436317f, 12.207812f, -72.48219 -- -141.20857f, 12.207812f, -99.361305//
		 * 																												
		 * -141.20857f, 12.207812f, -99.361305 -- -140.76079f, 12.207812f, -73.2765 -- -140.95941f, 12.207812f, -125.08106 -- 49.936264f, 12.207812f, -98.46633//
		 * 
		 * -140.95941f, 12.207812f, -125.08106 -- -141.20857f, 12.207812f, -99.361305 -- 51.615383f, 12.207812f, -125.00181//
		 * 
		 *  49.936264f, 12.207812f, -98.46633 -- 53.436317f, 12.207812f, -72.48219 -- -141.20857f, 12.207812f, -99.361305 -- 51.615383f, 12.207812f, -125.00181 -- 131.6367f, 12.207812f, -97.71996//
		 *  
		 *  131.6367f, 12.207812f, -97.71996 -- 49.936264f, 12.207812f, -98.46633 -- 132.75136f, 12.207812f, -72.71853 -- 131.18355f, 12.207812f, -126.06995//
		 *  
		 *  51.615383f, 12.207812f, -125.00181 -- -140.95941f, 12.207812f, -125.08106 -- 49.936264f, 12.207812f, -98.46633 -- 131.18355f, 12.207812f, -126.06995//
		 *  
		 *  131.18355f, 12.207812f, -126.06995 -- 51.615383f, 12.207812f, -125.00181 -- 131.6367f, 12.207812f, -97.71996
		 */
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}

}
